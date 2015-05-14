package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.ErrorHandlers;
import Global.Expr_Return;
import ImperaExceptions.ArithmeticTypeMismatchException;
import ImperaExceptions.ImperaException;
import SymbolTable.ArrayValue;
import SymbolTable.TypeSymbol;
import SymbolTable.Value;
import SymbolTable.VarValue;

public class Concat implements Expression {
	Expression e1;
	Expression e2;
	CommonTree errtree;
	
	public Concat(CommonTree errtree, Expression e1, Expression e2) {
		this.e1 = e1;
		this.e2 = e2;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		Expr_Return ret1 = e1.execute();
		Expr_Return ret2 = e2.execute();
		
		try {
			return concat((VarValue) ret1.value.getValue(), (VarValue) ret2.value.getValue());
		} catch (ClassCastException cce) {
			try {
				concat((ArrayValue) ret1.value.getValue(), (ArrayValue) ret2.value.getValue());
			} catch (ClassCastException cce2) {
				ErrorHandlers.reportArrayTypeError(errtree, ret1, ret2);
			}
		}
		
		//should never execute
		throw new ImperaException();
	}
	
	private Expr_Return concat(VarValue vv1, VarValue vv2) {
		return new Expr_Return(vv1.getType(), 
			new VarValue(vv1.getString() + vv2.getString()));	
	}
	private Expr_Return concat(ArrayValue av1, ArrayValue av2) {
		av1.getValue().addAll(av2.getValue());
		ArrayValue ret = new ArrayValue(av1.getValue(), av1.getArrayType());
		return new Expr_Return(ret.getType(), ret);
	}
}
