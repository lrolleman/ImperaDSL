package SymbolTable;

import Global.PersistentData;

public class KeyValue implements Value {
	String key;
	Value value;
	TypeSymbol keytype;
	
	public KeyValue(String key, TypeSymbol keytype, Value value) {
		this.key = key;
		this.keytype = keytype;
		this.value = value;
	}
	
	public Value getValue() {return value;}
	public String getKey() {return key;}
	public void setKey(String key) {this.key = key;}
	public TypeSymbol getType() {return PersistentData.symtab.resolveType("key");}
	public TypeSymbol getValueType() {return keytype;} 
}
