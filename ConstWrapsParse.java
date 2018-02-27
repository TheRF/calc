import java.util.*;

class ConstWrapsParse{
	private HashSet<String> PrioOne;
    private HashSet<String> PrioTwo;
    private HashSet<String> PrioThree;

    public ConstWrapsParse(){
        PrioOne = new HashSet<String>();
        PrioOne.add(Constants.PLUS.toString());
        PrioOne.add(Constants.MINUS.toString());

        PrioTwo = new HashSet<String>();
        PrioTwo.add(Constants.MULTIPLY.toString());
        PrioTwo.add(Constants.DIVIDE.toString());

        PrioThree = new HashSet<String>();
        PrioTwo.add(Constants.QUAD.toString());
        PrioTwo.add(Constants.POWER.toString());
        PrioTwo.add(Constants.ROOT.toString());
        PrioTwo.add(Constants.NROOTC.toString());
    }
    public HashSet<String> getPrioOne(){return PrioOne;};
    public HashSet<String> getPrioTwo(){return PrioTwo;};
    public HashSet<String> getPrioThree(){return PrioThree;};
}