package JSONShadow2;

import java.util.ArrayList;

import org.antlr.runtime.RecognitionException;

import JSONTree.*;
import JSONHandler.JSONParseRig;

public class JSONShadow2 {
	JSONTree[] output;
	public JSONShadow2(String src) throws RecognitionException {
		this(arrayify(src));
	}
	public JSONShadow2(String[] src) throws RecognitionException {
		output = new JSONTree[src.length];
		for (int i=0; i<src.length; i++) 
			output[i] = new JSONParseRig(src[i]).getJSONTree();
	}
	public JSONTree[] getJSONTrees() {return output;}
	private static String[] arrayify(String src) {
		String[] array = new String[1];
		array[0] = src;
		return array;
	}
}
