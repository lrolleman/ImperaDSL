package Expressions;

import org.antlr.runtime.tree.CommonTree;

import Global.Expr_Return;
import Global.PersistentData;
import ImperaExceptions.NullIdentifierException;
import SymbolTable.Scope;
import SymbolTable.VariableSymbol;

public class Identifier implements Expression{
	String id;
	CommonTree errtree;
	
	public Identifier(CommonTree errtree, String id) {
		this.id = id;
		this.errtree = errtree;
	}
	
	public Expr_Return execute() {
		VariableSymbol vs = (VariableSymbol) PersistentData.scopestack.peek().resolve(id);
		//System.out.println(id);
		//PersistentData.scopestack.peek().printVars();
		
			
		try {
			return new Expr_Return(vs.getType(), vs.getValue());
		} catch (NullPointerException npe) {
			/*for (Scope scope : PersistentData.scopestack) {
				scope.printVars();
				System.out.println();
			}*/
			
			throw new NullIdentifierException(errtree);
		}
	}
}
