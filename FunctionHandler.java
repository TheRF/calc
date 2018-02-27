class FunctionHandler{
	public String insertAtPos(String key, String text, int pos){
		if(pos>=text.length())
			text = text + key;
		else if(pos<=0)
			text = key + text;
		else{
			text = text.substring(0, pos-1) + key + text.substring(pos, text.length()-1);
		}

		return text;
	}

	public String deleteLastInput(String text){
		if(text.length()>1)
			text = text.substring(0, text.length()-1);
		else
			text = Constants.EMPTY;

		return text;
	}

	public String processFormula(String text){
		Parser p = new Parser();

		Double d = p.parse(text);
		text = d.toString();

		return text;
	}
}