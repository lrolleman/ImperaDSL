package Statements;

import ImperaExceptions.ContinueException;

public class Continue implements Statement {

	public Continue() {}
	public void execute() {
		throw new ContinueException();
	}
}
