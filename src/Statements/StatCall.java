package Statements;

import java.util.ArrayList;








import org.antlr.runtime.tree.CommonTree;

import ImperaExceptions.MismatchedArgumentsException;
import ImperaExceptions.ReturnException;
import ImperaExceptions.ReturnTypeMismatchException;
import ImperaExceptions.TypeMismatchException;
import SymbolTable.Scope;
import SymbolTable.VariableSymbol;
import Expressions.Expression;
import Global.Expr_Return;
import Global.PersistentData;

public class StatCall implements Statement {
	String id;
	ArrayList<Expression> args;
	CommonTree errtree;
	
	public StatCall(CommonTree errtree, String id) {
		this(errtree, id, null);
	}
	public StatCall(CommonTree errtree, String id, ArrayList<Expression> args) {
		this.id = id;
		this.errtree = errtree;
		if (args != null)
			this.args = args;
		else
			this.args = new ArrayList<Expression>();
	}
	
	public void execute() {
		Function function = PersistentData.scopestack.peek().resolveFunction(id);
		ArrayList<VariableSymbol> params = function.getParams();
		
		Scope es = PersistentData.symtab.getGlobalScope();
		Scope ns = new Scope(es);
		
		if (args.size() != params.size())
			throw new MismatchedArgumentsException(errtree);
		for (int i=0; i<args.size(); i++) {
			VariableSymbol vs = params.get(i);
			Expr_Return exp = args.get(i).execute();
			if (!vs.getType().equals(exp.type))
				throw new TypeMismatchException(errtree, "Mismatched types, expected " + exp.type.getName() + "but got " +
						vs.getType().getName());
			
			vs.setValue(exp.value);
			
			ns.define(vs);
		}
		PersistentData.scopestack.push(ns);
		try {
			function.getBlock().execute();
		} catch (ReturnException re) {
			if (!re.getValue().type.equals(function.getType()))
				throw new ReturnTypeMismatchException(errtree, "Function type and return type must match");
		}
		
		PersistentData.scopestack.pop();
	}
}
