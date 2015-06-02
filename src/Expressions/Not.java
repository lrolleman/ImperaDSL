package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.Stats;
import ImperaExceptions.LogicalTypeMismatchException;
import ImperaExceptions.TypeMismatchException;
import SymbolTable.KeyValue;
import SymbolTable.Value;
import SymbolTable.VarValue;

public class Not implements Expression{
	Expression expr;
	CommonTree errtree;
	
	public Not(CommonTree errtree, Expression expr) {
		this.expr = expr;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret = expr.execute();
		Value v;
		long starttime = 0;
		if (PersistentData.collect_stats)
			starttime = System.nanoTime();
		if (ret.type.getName().equals("var") || ret.type.getName().equals("key"))
			v = (Value) ret.value.getValue();
		else 
			throw new LogicalTypeMismatchException(errtree, "Cannot perform this operation on an " + ret.type.getName());
		
		try {
			VarValue vv = (VarValue) v;
			
			Boolean res = !vv.getBool();
			
			Expr_Return ret1 = new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(res.toString()));
			if (PersistentData.collect_stats)
				Stats.logic_time += System.nanoTime() - starttime;
			return ret1;
		} catch (ClassCastException cce) {
			throw new TypeMismatchException(errtree, "This operation requires both operands to be boolean");
		} catch (NullPointerException npe) {
			throw new TypeMismatchException(errtree, "This operation requires both operands to be boolean");
		}
	}
}
