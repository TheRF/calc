class CalcStringFuncs{
	public static String truncFloatVal(String value){
		int i = value.length()-1;
		while(i>=0 && value.charAt(i)!=Constants.DSEPNORM){
			i--;
		}

		if(i>=0 && value.charAt(i)==Constants.DSEPNORM){
			int l = value.length()-1;
			int k = 0;
			while(value.charAt(l)==Constants.ZERO){
				k++;
				l--;
			}

			if (k>0){
				value = value.substring(0, value.length()-k);// length() weil ausschliessend
			}

			// letztes Zeichen ein Komma -> entfernen
			if (value.charAt(value.length()-1)==Constants.DSEPNORM)
				if(value.length()>1)
					value = value.substring(0, value.length()-1);
				else
					value = Constants.EMPTY;
		}

		return value;
	}
}