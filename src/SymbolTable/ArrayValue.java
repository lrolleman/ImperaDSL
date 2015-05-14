package SymbolTable;

import java.util.ArrayList;

import Global.PersistentData;

public class ArrayValue implements Value {
	ArrayList<Value> array;
	TypeSymbol arrtype;
	
	public ArrayValue(ArrayList<Value> array, TypeSymbol arrtype) {
		this.arrtype = arrtype;
		this.array = array;
		
		for (Value element : array) {
			if (!element.getType().getName().equals(arrtype.getName())) {
				System.out.println("Error: All elements of an array must be of all the same base type");
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
