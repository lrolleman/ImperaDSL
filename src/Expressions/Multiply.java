package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.ErrorHandlers;
import Global.Expr_Return;
import Global.PersistentData;
import Global.Stats;
import Global.TypeSystem;
import ImperaExceptions.ArithmeticTypeMismatchException;
import ImperaExceptions.ImperaException;
import ImperaExceptions.NotANumberException;
import SymbolTable.KeyValue;
import SymbolTable.Value;
import SymbolTable.VarValue;

public class Multiply implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public Multiply(CommonTree errtree, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret1 = e1.execute();
		Expr_Return ret2 = e2.execute();
		long starttime = 0;
		if (PersistentData.collect_stats)
			starttime = System.nanoTime();
		try {
			Expr_Return ret = execute(TypeSystem.getAsVar(ret1.value), TypeSystem.getAsVar(ret2.value));
			if (PersistentData.collect_stats)
				Stats.arithmetic_time += System.nanoTime() - starttime;
			return ret;
		} catch (ClassCastException cce) {
			ErrorHandlers.reportArithmeticTypeError(errtree, ret1, ret2);
		}
		
		//should never execute
		throw new ImperaException();
	}
	
	
	private Expr_Return execute(VarValue vv1, VarValue vv2) throws NotANumberException {
		Integer i1 = vv1.getInteger();
		Integer i2 = vv2.getInteger();
		VarValue rv;
		if (i1 == null || i2 == null) {
			Double d1 = vv1.getFloatingPoint();
			Double d2 = vv2.getFloatingPoint();
			try {
			rv = new VarValue(new Double(d1 * d2));
			} catch (NullPointerException npe) {
				throw new NotANumberException(errtree);
			}
		} else {
			rv = new VarValue(new Integer(i1 * i2));
		}
		
		return new Expr_Return(rv.getType(), rv);
	}
}
