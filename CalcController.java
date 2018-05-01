import java.util.*;

class CalcController{
	private MemHandler mh;

	private CalcHistory fieldhistory;
	private CalcHistory charhistory;

	private void initHistory(){
		fieldhistory = new CalcHistory(Constants.SAVESIZE);
		fieldhistory.add(Constants.EMPTY);  // leeres Element damit synchron mit charhistory
	}

	public CalcController(){
		mh = new MemHandler(Constants.MEMORY_A, Constants.MEMORY_B, Constants.MEMORY_C);

		initHistory();
		charhistory = new CalcHistory(Constants.SAVESIZE);
	}

	public String processInput(String key, String text, int pos){
		String ret = Constants.EMPTY;
		ConstWrapsControl cwc = new ConstWrapsControl();
		ConstWrapsTranslate cwt = new ConstWrapsTranslate();
		FunctionHandler fh = new FunctionHandler();

		Character c = (key.length()==1 && cwc.containsChar(key.charAt(0))) ?
						key.charAt(0): cwt.externToIntern(key);

		ConstWrapsOperators cwo = new ConstWrapsOperators();
		if(text.equals(Constants.ZERO.toString()) && !cwo.isOperator(c))
			text = Constants.EMPTY;

		Boolean save = false;

		switch(cwc.getCharId(c)){
			case chRegular:
			case chTranslate:
				key = cwt.internToExtern(c);
				ret = fh.insertAtPos(key, text, pos);
				save = true;
				break;
			case chFunction:
				if(cwc.getMemSet().contains(c))
				{
					if(charhistory.isLast(Constants.EQUAL.toString()))
						// Modus 1: neuen Wert speichern
						mh.setMemory(key, Double.parseDouble(text));
					else{
						// Modus 2: alten Wert laden
						ret = fh.insertAtPos(mh.getMemory(key).toString(), text, pos);
						save = true;
					}
				} else if (c == Constants.DELETE_STEPC){
					fieldhistory.removeLast();
					charhistory.removeLast();
					ret = fieldhistory.last();
				} else if(c == Constants.CLEARC){
					initHistory();
					ret = Constants.EMPTY;
				} else if(c == Constants.DELETE_BACKC){
					if(text.length()==0)
						return Constants.EMPTY;
					
					text = cwt.convertTextToIntern(text);
					ret = fh.deleteLastInput(text);
					text = cwt.convertTextToExtern(text);
					save = true;
				} else if (c == Constants.EQUAL){
					if(text.length()==0)
						return Constants.EMPTY;

					initHistory();// Formeleingabe abgeschlossen -> Puffer leeren
					ret = cwt.convertTextToIntern(text);
					ret = fh.processFormula(text);

					// letzte Kommastelle abtrennen
				}
				else
					throw new RuntimeException("[CalcController] Unexpected: " + key);
				break;
			default:
				throw new RuntimeException("[CalcController] Unexpected: " + key);
		}

		if(save){
			if(!text.equals(fieldhistory.last()))
			  fieldhistory.add(text);
			charhistory.add(key);
		}

		return ret;
	}
}