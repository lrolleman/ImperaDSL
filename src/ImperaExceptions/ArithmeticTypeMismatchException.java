package ImperaExceptions;

import org.antlr.runtime.tree.CommonTree;

public class ArithmeticTypeMismatchException extends ImperaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2500774101843976766L;

	public ArithmeticTypeMismatchException(CommonTree tree, String message) {
		super(tree, message);
	}
}
