package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Global.PersistentData;

public class ObjectValue implements Value {
	Map<String, Value> members;
	
	public ObjectValue(HashMap<String, Value> members) {
		this.members = members;
	}
	
	public Map<String, Value> getValue() {return members;}
	public TypeSymbol getType() {return PersistentData.symtab.resolveType("object");}
	public Value get(String key) {return members.get(key);}
}
