class CalcStringFuncs{
	public static String truncFloatVal(String value){
		int i = value.length()-1;
		int j = 0;
		while(i>=0 && value.charAt(i)!=Constants.DSEPNORM){
			if(value.charAt(i)==Constants.ZERO)
				j++;
			i--;
		}
		if(i>=0 && value.charAt(i)==Constants.DSEPNORM){
			int l = value.length()-i;	// Anzahl Nachkommastellen
			int k = l-j;				// Davon endende Nullen

			if (k>0){
				value = value.substring(0, value.length()-1-k);
			}
			// letztes Zeichen ein Komma -> entfernen
			if (value.charAt(value.length()-1)==Constants.DSEPNORM)
				if(value.length()>1)
					value = value.substring(0, value.length()-2);
				else
					value = Constants.EMPTY;
		}

		return value;
	}
}