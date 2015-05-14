package SymbolTable;

import Global.PersistentData;

public class VarValue implements Value {
	String value; 
	TypeSymbol type;
	
	public VarValue(String value) {
		if (value.startsWith("\"") && value.endsWith("\""))
			this.value = value.substring(1, value.length()-1);
		else
			this.value = value;
		type = PersistentData.symtab.resolveType("var");
	}
	
	public Value getValue() {return this;}
	public TypeSymbol getType() {return type;}
	public String getString() {return value;}
	public Integer getInteger() {
		Integer ret;
		try {
			ret = Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			ret = null;
		}
		return ret;
	}
	public Double getFloatingPoint() throws NumberFormatException {
		Double ret;
		try {
			ret = Double.parseDouble(value);
		} catch (NumberFormatException nfe) {
			ret = null;
		}
		
		return ret;
	}
	public Boolean getBool() {
		if (value.equals("true"))
			return true;
		if (value.equals("false"))
			return false;
		
		return null;
	}
}
