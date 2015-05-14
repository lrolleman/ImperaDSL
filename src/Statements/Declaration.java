package Statements;
import org.antlr.runtime.tree.CommonTree;

import Expressions.*;
import ImperaExceptions.AlreadyDefinedException;
import ImperaExceptions.ImperaException;
import ImperaExceptions.TypeCastException;
import ImperaExceptions.TypeMismatchException;
import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import SymbolTable.*;

public class Declaration implements Statement {
	TypeSymbol type;
	String id;
	Expression expr;
	CommonTree errtree;
	
	public Declaration(CommonTree errtree, TypeSymbol type, String id, Expression expr) throws AlreadyDefinedException {
		this.type = type;
		this.id = id;
		this.expr = expr;
		this.errtree = errtree;
		
		if (PersistentData.scopestack.peek().resolve(id) != null) 
			throw new AlreadyDefinedException(errtree, "the variable " + id + " is already defined");
	}
	
	public void execute() throws ImperaException {
		VariableSymbol vs = new VariableSymbol(id, type, null);
		if (expr != null) {
			Expr_Return ret = expr.execute();
			Boolean pred = TypeSystem.promoteLookup(ret.type, type);
			if (pred == null)
				throw new TypeMismatchException(errtree, "The variable " + id + " cannot be assigned type " + ret.type.getName());
			
			switch (type.getName()) {
			case "var":
				try {
					vs.setValue(TypeSystem.getAsVar(ret.value));
				} catch (TypeCastException tce) {
					//TO-DO add stuff to error
					throw tce;
				}
				break;
			case "key":
				try {
					KeyValue kv = TypeSystem.getAsKey(ret.value);
					vs.setValue(kv);
				} catch (TypeCastException tce) {
					//TO-DO add stuff to error
					throw tce;
				}
				break;
			default:
				throw new ImperaException();
			}
		}
		PersistentData.scopestack.peek().define(vs);
	}
}