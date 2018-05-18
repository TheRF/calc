import java.util.*;

class ConstWrapsOperators{
	private HashSet<Character> PrioOne;
    private HashSet<Character> PrioTwo;
    private HashSet<Character> PrioThree;

    public ConstWrapsOperators(){
        PrioOne = new HashSet<Character>();
        PrioOne.add(Constants.PLUS);
        PrioOne.add(Constants.MINUS);

        PrioTwo = new HashSet<Character>();
        PrioTwo.add(Constants.MULTIPLY);
        PrioTwo.add(Constants.DIVIDE);

        PrioThree = new HashSet<Character>();
        //PrioTwo.add(Constants.QUAD);  // vorerst einzeln abgefangen
        PrioTwo.add(Constants.POWER);
        //PrioTwo.add(Constants.ROOT);  // vorerst einzeln abgefangen
        PrioTwo.add(Constants.NROOTC);
    }
    public HashSet<Character> getPrioOne(){return PrioOne;};
    public HashSet<Character> getPrioTwo(){return PrioTwo;};
    public HashSet<Character> getPrioThree(){return PrioThree;};

    public Boolean isOperator(Character c){
        return (PrioOne.contains(c) || PrioTwo.contains(c) || PrioThree.contains(c));
    }
}