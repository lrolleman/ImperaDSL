package SymbolTable;

import java.util.ArrayList;

import Global.PersistentData;

public class ArrayValue implements Value {
	ArrayList<Value> array;
	TypeSymbol arrtype;
	
	public ArrayValue(ArrayList<Value> array) {
		this.arrtype = array.get(0).getType();
		this.array = array;
		
		for (Value element : array) {
			if (!element.getType().getName().equals(arrtype.getName())) {
				System.err.println("Error: All elements of an array must be of all the same base type");
				System.exit(-1);
			}
		}
	}
	
	public ArrayList<Value> getValue() {return array;}
	public TypeSymbol getType() {return PersistentData.symtab.resolveType("array");}
	public TypeSymbol getArrayType() {return arrtype;}
	public Value get(Integer index) {return array.get(index);}
	public void add(Value value) {array.add(value);}
}
