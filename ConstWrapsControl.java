import java.util.*;

enum CharId {chRegular, chTranslate, chFunction}

class ConstWrapsControl{
    private HashMap<Character, CharId> functypes;
    private HashSet<Character> memtypes;

    public ConstWrapsControl(){
    	functypes = new HashMap<Character, CharId>();

    	// Zeichen
    	functypes.put(Constants.PLUS, CharId.chRegular);
    	functypes.put(Constants.MINUS, CharId.chRegular);
    	functypes.put(Constants.MULTIPLY, CharId.chRegular);
    	functypes.put(Constants.DIVIDE, CharId.chRegular);
    	functypes.put(Constants.POWER, CharId.chRegular);
    	functypes.put(Constants.PAROPEN, CharId.chRegular);
    	functypes.put(Constants.PARCLOSE, CharId.chRegular);
    	functypes.put(Constants.ZERO, CharId.chRegular);
    	functypes.put(Constants.ONE, CharId.chRegular);
    	functypes.put(Constants.TWO, CharId.chRegular);
    	functypes.put(Constants.THREE, CharId.chRegular);
    	functypes.put(Constants.FOUR, CharId.chRegular);
    	functypes.put(Constants.FIVE, CharId.chRegular);
    	functypes.put(Constants.SIX, CharId.chRegular);
    	functypes.put(Constants.SEVEN, CharId.chRegular);
    	functypes.put(Constants.EIGHT, CharId.chRegular);
    	functypes.put(Constants.NINE, CharId.chRegular);
    	functypes.put(Constants.NEGATE, CharId.chRegular);
    	functypes.put(Constants.SPACE, CharId.chRegular);
    	functypes.put(Constants.DSEP, CharId.chRegular);

    	// Zeichen bei denen interne und externe Form sich unterscheiden
    	functypes.put(Constants.QUAD, CharId.chTranslate);
    	functypes.put(Constants.ROOT, CharId.chTranslate);
    	functypes.put(Constants.NROOTC, CharId.chTranslate);

    	// interne Funtionen
        functypes.put(Constants.MEMORY_AC, CharId.chFunction);
        functypes.put(Constants.MEMORY_BC, CharId.chFunction);
        functypes.put(Constants.MEMORY_CC, CharId.chFunction);
    	functypes.put(Constants.DELETE_STEPC, CharId.chFunction);
    	functypes.put(Constants.CLEARC, CharId.chFunction);
    	functypes.put(Constants.DELETE_BACKC, CharId.chFunction);
    	functypes.put(Constants.EQUAL, CharId.chFunction);

        // Speicher
        memtypes = new HashSet<Character>();
        memtypes.add(Constants.MEMORY_AC);
        memtypes.add(Constants.MEMORY_BC);
        memtypes.add(Constants.MEMORY_CC);
    }

    public CharId getCharId(Character c){
    	return functypes.get(c);
    }

    public boolean containsChar(Character c){
        return functypes.containsKey(c);
    }

    public HashSet<Character> getMemSet(){return memtypes;}
}