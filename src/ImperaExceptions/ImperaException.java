package ImperaExceptions;

import org.antlr.runtime.tree.CommonTree;

public class ImperaException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7856805538921632534L;

	public ImperaException() {
		this("Base Exception thrown, something fishy is going on");
	}
	protected ImperaException(String message) {
		super(message);
	}
	protected ImperaException(CommonTree tree, String message) {
		super(tree.getLine() + ": " + message);
	}
}
