package Expressions;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import Global.ErrorHandlers;
import Global.Expr_Return;
import Global.GlobalMethods;
import Global.PersistentData;
import Global.Stats;
import Global.TypeSystem;
import PIExceptions.ArithmeticTypeMismatchException;
import PIExceptions.PIException;
import PIExceptions.NotANumberException;
import PIExceptions.TypeCastException;
import SymbolTable.ArrayValue;
import SymbolTable.KeyValue;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VectorValue;

public class Divide implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public Divide(CommonTree errtree, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret1 = e1.execute();
		Expr_Return ret2 = e2.execute();
		
		return execute(ret1.value, ret2.value);
	}
	
	private Expr_Return execute(Value val1, Value val2) {
		long starttime = 0;
		if (PersistentData.collect_stats)
			starttime = System.nanoTime();
		try {
			Expr_Return ret = execute(TypeSystem.getAsVar(val1), TypeSystem.getAsVar(val2));
			if (PersistentData.collect_stats)
				Stats.arithmetic_time += System.nanoTime() - starttime;
			return ret;
		} catch (TypeCastException cce) {
			try {
				VectorValue vv1 = TypeSystem.getAsVector(val1);
				VectorValue vv2 = TypeSystem.getAsVector(val2);
				if (vv1.getSize() < vv2.getSize())
					vv1 = GlobalMethods.extend(val1, vv2.getSize());
				else if (vv1.getSize() > vv2.getSize())
					vv2 = GlobalMethods.extend(val2, vv1.getSize());
				Expr_Return ret = execute(vv1, vv2);
				if (PersistentData.collect_stats)
					Stats.arithmetic_time += System.nanoTime() - starttime;
				return ret;
			} catch (PIException ie) {
				ErrorHandlers.reportArithmeticTypeError(errtree,
						new Expr_Return(val1.getType(), val2), new Expr_Return(val2.getType(), val2));
			}
		}
		
		//should never execute
		throw new PIException();
	}
	
	private Expr_Return execute(VarValue vv1, VarValue vv2) throws NotANumberException {
		Integer i1 = vv1.getInteger();
		Integer i2 = vv2.getInteger();
		VarValue rv;
		if (i1 == null || i2 == null) {
			Double d1 = vv1.getFloatingPoint();
			Double d2 = vv2.getFloatingPoint();
			try {
			rv = new VarValue(new Double(d1 / d2));
			} catch (NullPointerException npe) {
				throw new NotANumberException(errtree);
			}
		} else {
			rv = new VarValue(new Integer(i1 / i2));
		}
		
		return new Expr_Return(rv.getType(), rv);
	}
	
	private Expr_Return execute(VectorValue vv1, VectorValue vv2) {
		ArrayList<Value> result = new ArrayList<Value>();
		for (int i=0; i<vv1.getSize(); i++) {
			result.add(execute(vv1.get(i), vv2.get(i)).value);
		}
		return new Expr_Return(PersistentData.symtab.resolveType("vector"), new VectorValue(result));
	}
}
