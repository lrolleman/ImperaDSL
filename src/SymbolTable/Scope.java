package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Statements.Function;

public class Scope {
	Map<String, VariableSymbol> vars;
	Map<String, Function> functions;
	Scope enclosingscope;
	
	public Scope(Scope enclosingscope) {
		this.enclosingscope = enclosingscope;
		vars = new HashMap<String, VariableSymbol>();
		functions = new HashMap<String, Function>();
	}
	
	public Scope getEnclosingScope() {return enclosingscope;}
	public void define(VariableSymbol var) {
		vars.put(var.getName(), var);
	}
	public void define(Function func) {
		functions.put(func.getID(), func);
	}
	public Symbol resolve(String name) {
		Symbol s = vars.get(name);
	    Scope currscope = this;
	    while (s == null && currscope.getEnclosingScope() != null) {
	            currscope = currscope.getEnclosingScope();
	            s = currscope.resolve(name);
	    }
	    return s; 
	}
	public Symbol resolveLocal(String name) {
		return vars.get(name);
	}
	public Function resolveFunction(String id) {
		Function f = functions.get(id);
		Scope currscope = this;
		while (f == null && currscope.getEnclosingScope() != null) {
			currscope = currscope.getEnclosingScope();
			f = currscope.resolveFunction(id);
		}
		return f;
	}
	public void printVars() {
		
		for (String key : vars.keySet()) {
			System.out.print(vars.get(key).getName());
		}
		System.out.println();
	}
}
