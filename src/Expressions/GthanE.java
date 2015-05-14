package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.ErrorHandlers;
import Global.Expr_Return;
import Global.PersistentData;
import Global.TypeSystem;
import ImperaExceptions.ImperaException;
import ImperaExceptions.TypeCastException;
import SymbolTable.KeyValue;
import SymbolTable.VarValue;

public class GthanE implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public GthanE(CommonTree errtree, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret1 = e1.execute();
		Expr_Return ret2 = e2.execute();
		
		try {
			VarValue vv1 = TypeSystem.getAsVar(ret1.value);
			VarValue vv2 = TypeSystem.getAsVar(ret2.value);
			
			Boolean res = vv1.getFloatingPoint() >= vv2.getFloatingPoint();
			
			return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(res.toString()));
		} catch (TypeCastException tce) {
			ErrorHandlers.reportLogicalTypeError(errtree, ret1, ret2);
		} catch (NullPointerException npe) {
			ErrorHandlers.reportLogicalTypeError(errtree, ret1, ret2);
		}
		
		//should never execute
		throw new ImperaException();
	}
}
