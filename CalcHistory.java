import java.util.*;

class CalcHistory{
	private int stepamount;
	private ArrayList<String> history;

	private void removeUntilUp(int i){
		while(history.size()>i)
			history.remove(0);
	}

	private void removeUntilDown(int i){
		while(history.size()>i)
			history.remove(history.size()-1);
	}

	private String getEntry(int i){
		return history.get(i);
	}

	public CalcHistory(int count){
		stepamount = count;

		history = new ArrayList<String>();
	}

	public void add(String s){
		history.add(s);

		removeUntilUp(stepamount);
	}

	public void clear(){
		removeUntilUp(0);
	}

	public String jumpTo(int i){
		removeUntilDown(i);
		return getEntry(i);
	}

	public String last(){
		String ret = Constants.EMPTY;

		if(history.size()>0)
			ret = history.get(history.size()-1);

		return ret;
	}

	public void removeLast(){
		if(history.size()>0)
			removeUntilDown(history.size()-1);
	}
}