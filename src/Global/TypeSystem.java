package Global;

import ImperaExceptions.ImperaException;
import ImperaExceptions.TypeCastException;
import SymbolTable.ArrayValue;
import SymbolTable.KeyValue;
import SymbolTable.TypeSymbol;
import SymbolTable.Value;
import SymbolTable.VarValue;

public class TypeSystem {
	public static String[] types = {"var", "key", "array", "object", "void"};
	
	static Boolean[][] promotelookup = {
			    /*var*/  /*key*/ /*array*/ /*object*/ /*void*/
	/*var*/		{false,   true,   null,     null,     null},
	/*key*/		{true,    false,  true,     true,     null},
	/*array*/   {null,    null,   false,    null,     null},
	/*object*/  {null,    null,   null,     false,    null},
	/*void*/    {null,    null,   null,     null,     false}
	};
	
	static Boolean[][] exprlookup = {
	    		/*var*/  /*key*/ /*array*/ /*object*/ /*void*/
	/*var*/		{false,   true,   null,     null,     null},
	/*key*/		{true,    false,  true,     true,     null},
	/*array*/   {null,    true,   false,    null,     null},
	/*object*/  {null,    true,   null,     false,    null},
	/*void*/    {null,    null,   null,     null,     false}
};
	
	public static Boolean promoteLookup(TypeSymbol t1, TypeSymbol t2) {
		try {
			return promotelookup[t1.getTypeNum()][t2.getTypeNum()];
		} catch (ArrayIndexOutOfBoundsException ae) {
			return null;
		}
	}
	
	public static Boolean exprLookup(TypeSymbol t1, TypeSymbol t2) {
		try {
			return exprlookup[t1.getTypeNum()][t2.getTypeNum()];
		} catch (ArrayIndexOutOfBoundsException ae) {
			return null;
		}
	}
	
	public static VarValue getAsVar(Value val) {
		Boolean res = exprLookup(val.getType(), PersistentData.symtab.resolveType("var"));
		
		if (res == null)
			throw new TypeCastException("failed promotion lookup");
		
		try {
			return (VarValue) val.getValue();
		} catch (ClassCastException cce) {
			throw new TypeCastException("illegal cast");
		}
	}
	
	public static KeyValue getAsKey(Value val) {
		try {
			return (KeyValue) val;
		} catch (ClassCastException cce) {
			return new KeyValue(null, val.getType(), val);
		}
	}
	
	public static ArrayValue getAsArray(Value val) {
		try {
			return (ArrayValue) val;
		} catch (ClassCastException cce) {
			throw new TypeCastException("illegal cast to array");
		}
	}
}
