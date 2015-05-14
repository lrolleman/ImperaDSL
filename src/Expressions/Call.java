package Expressions;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import ImperaExceptions.ImperaException;
import ImperaExceptions.MismatchedArgumentsException;
import ImperaExceptions.ReturnException;
import ImperaExceptions.ReturnTypeMismatchException;
import ImperaExceptions.TypeMismatchException;
import Global.Expr_Return;
import Global.GlobalMethods;
import Global.PersistentData;
import Statements.Function;
import Statements.Statement;
import SymbolTable.Scope;
import SymbolTable.VariableSymbol;

public class Call implements Expression {
	String id;
	ArrayList<Expression> args;
	CommonTree errtree;
	
	public Call(CommonTree errtree, String id) {
		this(errtree, id, null);
	}
	public Call(CommonTree errtree, String id, ArrayList<Expression> args) {
		this.id = id;
		if (args != null)
			this.args = args;
		else
			this.args = new ArrayList<Expression>();
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Function function = PersistentData.scopestack.peek().resolveFunction(id);
		ArrayList<VariableSymbol> params = function.getParams();
		
		Scope es = PersistentData.symtab.getGlobalScope();
		Scope ns = new Scope(es);
		//PersistentData.scopestack.peek().printVars();
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
			PersistentData.scopestack.pop();
			
			if (!re.getValue().type.equals(function.getType()))
				throw new ReturnTypeMismatchException(errtree, "Function type and return type must match");
			return re.getValue();
		}
		//PersistentData.scopestack.pop();
		throw new ImperaException();
	}
}
