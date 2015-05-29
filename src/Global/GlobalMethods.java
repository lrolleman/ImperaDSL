package Global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

import ImperaExceptions.PrintException;
import SymbolTable.KeyValue;
import SymbolTable.ObjectValue;
import SymbolTable.Value;
import SymbolTable.VarValue;
import SymbolTable.VariableSymbol;

public class GlobalMethods {
	@SuppressWarnings("unchecked")
	public static void print(CommonTree tree, Value val) {
		print(tree, val, "");
	}
	/*public static String sprint(Value val) {
		return sprint("", val, "");
	}*/
	private static void print(CommonTree tree, Value val, String delim) {
		switch (val.getType().getName()) {
		case "var":
			VarValue vv1 = (VarValue) val;
			String st = (String) vv1.getString();
			System.out.print(st + delim);
			break;
		case "array":
			ArrayList<Value> arr = (ArrayList<Value>) val.getValue();
			for (int i=0; i<arr.size(); i++) {
				if (i == 0) 
					System.out.print("[");
				if (i == arr.size()-1)
					print(tree, arr.get(i), "]");
				else 
					print(tree, arr.get(i), ", ");
			}
			break;
		case "key":
			KeyValue key = (KeyValue) val;
			System.out.print(key.getKey() + ":");
			print(tree, key.getValue(), "");
			break;
		case "object":
			ObjectValue ov = TypeSystem.getAsObject(val);
			HashMap<String, VariableSymbol> obj = (HashMap<String, VariableSymbol>) ov.getValue();
			Set<String> keyset = obj.keySet();
			int i = 0;
			for (String okey : keyset) {
				if (i == 0)
					System.out.print("<");
				if (i == keyset.size()-1)
					print(tree, obj.get(okey).getValue(), ">");
				else
					print(tree, obj.get(okey).getValue(), ", ");
				i++;
			}
			break;
		default:
			throw new PrintException(tree, "This value is not printable");
		}
	}
	/*private static String sprint(String sval, Value val, String delim) {
		switch (val.getType().getName()) {
		case "var":
			VarValue vv1 = (VarValue) val;
			String st = (String) vv1.getString();
			sval = sval + st + delim;
			break;
		case "array":
			ArrayList<Value> arr = (ArrayList<Value>) val.getValue();
			for (int i=0; i<arr.size(); i++) {
				if (i == 0) 
					sval = sval + "[";
				if (i == arr.size()-1)
					sval = sprint(sval, arr.get(i), "]");
				else 
					sval = sprint(sval, arr.get(i), ", ");
			}
			break;
		case "key":
			KeyValue key = (KeyValue) val;
			sval = key.getKey() + ":";
			sval = sprint(sval, key.getValue(), "");
			break;
		default:
			throw new PrintException("This value is not printable");
		}
		return sval;
	}*/
}
