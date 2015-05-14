package ImperaExceptions;

import org.antlr.runtime.tree.CommonTree;

public class ReturnTypeMismatchException extends ImperaException {
	
	public ReturnTypeMismatchException(CommonTree errtree, String message) {
		super(errtree, message);
	}
}
