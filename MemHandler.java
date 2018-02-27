import java.util.*;

class MemHandler{
	private HashMap<String, Memory> banks;

	private void initMemHandler(String[] names){
		banks = new HashMap<String, Memory>();

		for (int i=0; i<names.length; i++){
			banks.put(names[i], new Memory());
		}
	}

	public MemHandler(String ... names){
		int bankcount = names.length;

		initMemHandler(names);
	}

	public void setMemory(String name, double val){
		banks.get(name).setMemory(val);
	}

	public Double getMemory(String name){
		return banks.get(name).getMemory();
	}
}