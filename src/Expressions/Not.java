package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import Global.Stats;
import Global.TypeSystem;
import ImperaExceptions.LogicalTypeMismatchException;
import ImperaExceptions.TypeCastException;
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
		try {
			Expr_Return ret1 = execute(TypeSystem.getAsVar(ret.value));
			if (PersistentData.collect_stats)
				Stats.logic_time += System.nanoTime() - starttime;
			return ret1;
		} catch (ClassCastException cce) {
			throw new TypeMismatchException(errtree, "This operation requires the operand to be boolean");
		} catch (NullPointerException npe) {
			throw new TypeMismatchException(errtree, "This operation requires the operand to be boolean");
		} catch (TypeCastException tce) {
			throw tce;
		}
	}
	
	private Expr_Return execute(VarValue vv) {
		Boolean res = !vv.getBool();
		
		return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(res.toString()));
	}
}
