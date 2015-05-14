package Statements;

import org.antlr.runtime.tree.CommonTree;

import Expressions.*;
import ImperaExceptions.ImperaException;
import ImperaExceptions.TypeCastException;
import ImperaExceptions.TypeMismatchException;
import ImperaExceptions.UndefinedIdentifierException;
import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import SymbolTable.KeyValue;
import SymbolTable.TypeSymbol;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VariableSymbol;

public class Assignment implements Statement {
	//TypeSymbol type;
	String id;
	Expression expr;
	CommonTree errtree;
	
	public Assignment(CommonTree errtree, String id, Expression expr) throws UndefinedIdentifierException {
		this.id = id;
		this.expr = expr;
		this.errtree = errtree;
	}
	
	public void execute() throws ImperaException {
		Expr_Return ret = expr.execute();
		
		VariableSymbol vs = (VariableSymbol) PersistentData.scopestack.peek().resolve(id);
		if (vs == null) 
			throw new UndefinedIdentifierException(errtree, "The identifier " + id + " is undefined");
		
		switch (vs.getType().getName()) {
		case "var":
			Boolean predv = TypeSystem.promoteLookup(ret.type, vs.getType());
			if (predv == null)
				throw new TypeMismatchException(errtree, "The variable " + vs.getName() + " cannot be assigned type " + ret.type.getName());
			
			try {
				vs.setValue(TypeSystem.getAsVar(ret.value));
			} catch (TypeCastException tce) {
				//TO-DO add stuff to error
				throw tce;
			}
			break;
		case "key":
			Boolean predk = TypeSystem.promoteLookup(ret.type, vs.getType());
			if (predk == null)
				throw new TypeMismatchException(errtree, "The variable " + vs.getName() + " cannot be assigned type " + ret.type.getName());
			
			try {
				KeyValue kv = TypeSystem.getAsKey(ret.value);
				KeyValue vsk = TypeSystem.getAsKey(vs.getValue());
				if (kv.getKey() == null)
					kv.setKey(vsk.getKey());
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
}
