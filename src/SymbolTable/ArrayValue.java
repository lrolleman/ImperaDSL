package SymbolTable;

import java.util.ArrayList;

import Global.PersistentData;

public class ArrayValue implements Value {
	ArrayList<Value> array;
	
	public ArrayValue(ArrayList<Value> array) {
		this.array = array;
	}
	
	public ArrayList<Value> getValue() {return array;}
	public TypeSymbol getType() {return PersistentData.symtab.resolveType("array");}
	public Value get(Integer index) {return array.get(index);}
	public void add(Value value) {
		array.add(value);
	}
	public Integer getSize() {return array.size();}
}
