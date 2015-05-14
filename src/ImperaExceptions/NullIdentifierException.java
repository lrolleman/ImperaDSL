package ImperaExceptions;

import org.antlr.runtime.tree.CommonTree;

public class NullIdentifierException extends ImperaException {
	public NullIdentifierException(CommonTree tree) {
		this(tree, "Identifier has no value");
	}
	public NullIdentifierException(CommonTree tree, String message) {
		super(tree, message);
	}
}
