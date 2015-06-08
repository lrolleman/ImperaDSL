package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import ImperaExceptions.NotANumberException;
import ImperaExceptions.TypeCastException;
import SymbolTable.KeyValue;
import SymbolTable.VarValue;

public class Neg implements Expression {
	Expression expr;
	CommonTree errtree;
	
	public Neg(CommonTree errtree, Expression e) {
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
			d = -d;
			v = new VarValue(d);
		} else {
			i = -i;
			v = new VarValue(i);
		}
		
		return new Expr_Return(v.getType(), v);
	}
}
