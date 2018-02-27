import java.util.*;

class ConstWrapsTranslate{
	private HashMap<String, Character> convertToIntern;
	private HashMap<Character, String> convertToExtern;

	public ConstWrapsTranslate(){
		convertToIntern = new HashMap<String, Character>();
		convertToIntern.put(Constants.MEMORY_A, Constants.MEMORY_AC);
		convertToIntern.put(Constants.MEMORY_B, Constants.MEMORY_BC);
		convertToIntern.put(Constants.MEMORY_C, Constants.MEMORY_CC);
		convertToIntern.put(Constants.DELETE_STEP, Constants.DELETE_STEPC);
		convertToIntern.put(Constants.CLEAR, Constants.CLEARC);
		convertToIntern.put(Constants.DELETE_BACK, Constants.DELETE_BACKC);
		convertToIntern.put(Constants.NROOT_PUB, Constants.NROOTC);

		convertToExtern = new HashMap<Character, String>();
		convertToExtern.put(Constants.MEMORY_AC, Constants.MEMORY_A);
		convertToExtern.put(Constants.MEMORY_BC, Constants.MEMORY_B);
		convertToExtern.put(Constants.MEMORY_CC, Constants.MEMORY_C);
		convertToExtern.put(Constants.DELETE_STEPC, Constants.DELETE_STEP);
		convertToExtern.put(Constants.CLEARC, Constants.CLEAR);
		convertToExtern.put(Constants.DELETE_BACKC, Constants.DELETE_BACK);
		convertToExtern.put(Constants.NROOTC, Constants.NROOT_PUB);
	}

	public String internToExtern(Character c){
		String ret = c.toString();

		if(convertToExtern.containsKey(c))
			ret = convertToExtern.get(c);

		return ret;
	}

	public Character externToIntern(String s){
		Character ret = s.charAt(0);

		if(convertToIntern.containsKey(s))
			ret = convertToIntern.get(s);

		return ret;
	}

	public String convertTextToIntern(String text){
		for(String s: convertToIntern.keySet()){
			String val = convertToIntern.get(s).toString();
			text.replace(s, val);
		}
		return text;
	}

	public String convertTextToExtern(String text){
		for(Character s: convertToExtern.keySet()){
			String val = convertToExtern.get(s);
			text.replace(s.toString(), val);
		}
		return text;
	}
}