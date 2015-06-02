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
import SymbolTable.ArrayValue;
import SymbolTable.KeyValue;
import SymbolTable.Value;
import SymbolTable.VarValue;

public class Power implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public Power(CommonTree errtree, Expression e1, Expression e2) {
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
		try {
			Integer val1 = (int) Math.pow(vv1.getInteger(), vv2.getInteger());
			return new Expr_Return(vv1.getType(), 
					new VarValue(val1));
		} catch (NumberFormatException nfe) {
			try {
				Double val2 = Math.pow(vv1.getFloatingPoint(), vv2.getFloatingPoint());
				return new Expr_Return(vv1.getType(), 
						new VarValue(val2));
			} catch (NumberFormatException nfe2) {
				throw new NotANumberException(errtree, "This value is not a number");
			}
		}
	
	}
}
