package ImperaExceptions;

import org.antlr.runtime.tree.CommonTree;

public class IllegalIndexException extends ImperaException {

	public IllegalIndexException(CommonTree tree, String message) {
		super(tree, message);
	}

}
