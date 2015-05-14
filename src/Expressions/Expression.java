package Expressions;

import Global.Expr_Return;
import ImperaExceptions.ImperaException;

public interface Expression {
	public Expr_Return execute() throws ImperaException ;
}
