package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.TypeSystem;
import ImperaExceptions.NotANumberException;
import ImperaExceptions.TypeCastException;
import SymbolTable.KeyValue;
import SymbolTable.VarValue;

public class Pos implements Expression {
	Expression expr;
	CommonTree errtree;
	
	public Pos(CommonTree errtree, Expression e) {
		this.expr = e;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ex = expr.execute();
		try {
			return execute(TypeSystem.getAsVar(ex.value));
		} catch (TypeCastException tce) {
			throw tce;
		}
	}
	
	private Expr_Return execute(VarValue v) {
		Integer i = v.getInteger();
		if (i == null) {
			
			Double d = v.getFloatingPoint();
			if (d == null)
				throw new NotANumberException(errtree);
			d = Math.abs(d);
			v = new VarValue(d);
		} else {
			i = Math.abs(i);
			v = new VarValue(i);
		}
		
		return new Expr_Return(v.getType(), v);
	}
}
