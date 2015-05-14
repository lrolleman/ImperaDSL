package Global;

import java.util.ArrayList;

import Expressions.Call;
import Statements.Function;
import Statements.Statement;
import SymbolTable.Scope;
import SymbolTable.Value;

public class Root {
	ArrayList<Statement> globalstatements;
	
	public Root(ArrayList<Statement> gstats) {
		this.globalstatements = gstats;
	}
	
	public Value execute() {
		for (Statement stat : globalstatements) {
			stat.execute();
		}
		
		return new Call(null, "main").execute().value;
	}
}
