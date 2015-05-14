package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.TypeSystem;
import ImperaExceptions.TypeCastException;
import SymbolTable.TypeSymbol;

public class Cast implements Expression {
	TypeSymbol type;
	Expression expr;
	CommonTree errtree;
	
	public Cast(CommonTree errtree, TypeSymbol type, Expression expr) {
		this.errtree = errtree;
		this.type = type;
		this.expr = expr;
	}
	
	public Expr_Return execute() {
		Expr_Return ret = expr.execute();
		switch (type.getName()) {
		case "var":
			ret.value = TypeSystem.getAsVar(ret.value);
			break;
		case "key":
			ret.value = TypeSystem.getAsKey(ret.value);
			break;
		default:
			throw new TypeCastException(errtree, "This type cannot be cast");
		}
		
		return ret;
	}
}
