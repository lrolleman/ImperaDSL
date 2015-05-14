package Statements;

import java.util.ArrayList;

import Global.PersistentData;
import SymbolTable.Scope;

public class Block implements Statement {
	ArrayList<Statement> decl;
	ArrayList<Statement> statements;
	
	public Block(ArrayList<Statement> decl, ArrayList<Statement> statements) {
		this.decl = decl;
		this.statements = statements;
	}
	
	public void execute() {
		
		PersistentData.scopestack.push(new Scope(PersistentData.scopestack.peek()));
		for (Statement dec : decl)
			dec.execute();
		for (Statement stat : statements)
			stat.execute();
		PersistentData.scopestack.pop();
		
	}
	
	public ArrayList<Statement> getStatements() {
		ArrayList<Statement> ret = new ArrayList<Statement>();
		ret.addAll(decl);
		ret.addAll(statements);
		return ret;
	}
	
	public void addVoidReturn() {
		statements.add(new Return(null));
	}
	
	public Boolean endsWithReturn() {
		return statements.get(statements.size()-1) instanceof Return;
	}
}
