package Expressions;

import java.util.ArrayList;

import Global.Expr_Return;
import Global.PersistentData;
import SymbolTable.ArrayValue;
import SymbolTable.Value;

public class ArrayConstructor implements Expression{
	ArrayList<Expression> exprs;
	
	public ArrayConstructor(ArrayList<Expression> exprs) {
		this.exprs = exprs;
	}
	
	public Expr_Return execute() {
		ArrayList<Value> values = new ArrayList<Value>();
		for (Expression expr : exprs) 
			values.add(expr.execute().value);
		
		return new Expr_Return(PersistentData.symtab.resolveType("array"), new ArrayValue(values));
	}
}
