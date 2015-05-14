package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
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
		
		if (ret.type.getName().equals("var") || ret.type.getName().equals("key"))
			v = (Value) ret.value.getValue();
		else 
			throw new LogicalTypeMismatchException(errtree, "Cannot perform this operation on an " + ret.type.getName());
		
		try {
			VarValue vv = (VarValue) v;
			
			Boolean res = !vv.getBool();
			
			return new Expr_Return(PersistentData.symtab.resolveType("var"), new VarValue(res.toString()));
		} catch (ClassCastException cce) {
			throw new TypeMismatchException(errtree, "This operation requires both operands to be boolean");
		} catch (NullPointerException npe) {
			throw new TypeMismatchException(errtree, "This operation requires both operands to be boolean");
		}
	}
}
