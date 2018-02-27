import java.util.*;

class ConstWrapsButtonPosition{
	//Struktur: jedem Button-Label wird Zeile zugeordnet
	// 			Einfügezeit in Liste->Einfügezeit bei Button-Erzeugung
	private ArrayList<ArrayList<String>> buttonlist;

	public ConstWrapsButtonPosition(){
		buttonlist = new ArrayList<ArrayList<String>>();

		// erste Zeile
		ArrayList<String> top = new ArrayList<String>();
		top.add(Constants.PAROPEN.toString());
		top.add(Constants.MEMORY_A);
		top.add(Constants.MEMORY_B);
		top.add(Constants.MEMORY_C);
		top.add(Constants.PARCLOSE.toString());

		buttonlist.add(top);

		// zweite Zeile
		ArrayList<String> snd = new ArrayList<String>();
		snd.add(Constants.SEVEN.toString());
		snd.add(Constants.EIGHT.toString());
		snd.add(Constants.NINE.toString());
		snd.add(Constants.DIVIDE.toString());
		snd.add(Constants.QUAD.toString());
		snd.add(Constants.CLEAR);

		buttonlist.add(snd);

		// dritte
		ArrayList<String> trd = new ArrayList<String>();
		trd.add(Constants.FOUR.toString());
		trd.add(Constants.FIVE.toString());
		trd.add(Constants.SIX.toString());
		trd.add(Constants.MULTIPLY.toString());
		trd.add(Constants.POWER.toString());
		trd.add(Constants.DELETE_STEP);

		buttonlist.add(trd);

		// vierte
		ArrayList<String> fth = new ArrayList<String>();
		fth.add(Constants.ONE.toString());
		fth.add(Constants.TWO.toString());
		fth.add(Constants.THREE.toString());
		fth.add(Constants.MINUS.toString());
		fth.add(Constants.ROOT.toString());
		fth.add(Constants.DELETE_BACK);

		buttonlist.add(fth);

		// letzte
		ArrayList<String> lst = new ArrayList<String>();
		lst.add(Constants.ZERO.toString());
		lst.add(Constants.PLUS.toString());
		lst.add(Constants.NROOT_PUB);
		lst.add(Constants.EQUAL.toString());

		buttonlist.add(lst);

	}

	public int getHLinesCount(){
		return buttonlist.size();
	}

	public ArrayList<String> getHLine(int index){
		return buttonlist.get(index);
	}
}