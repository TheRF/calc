import java.util.*;

/*
    Original von: https://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-form/26227947#26227947
*/
// Grammar:
// expression = term | expression `+` term | expression `-` term
// term = factor | term `*` factor | term `/` factor
// factor = `+` factor | `-` factor | `(` expression `)`
//        | number | functionName factor | factor `^` factor | Wurzel factor | factor Quadrat
class Parser{
    private ConstWrapsOperators con;
    private MathLib lib;
    private int pos, ch, prevch;
    private String str;

    public Parser(){
        con = new ConstWrapsOperators();
        lib = new MathLib();
    }

    public double parse(String input){
        pos = -1;
        str = input;

        nextChar();
        double x = parseExpression();
        if (pos < str.length()) throw new RuntimeException("[Parser] Unexpected: " + (char)ch);
        return x;
    }

    private void nextChar() {
        prevch = ch;
        ch = (++pos < str.length()) ? str.charAt(pos) : -1;
    }

    private boolean eat(HashSet<Character> charToEatSet) {
        while (ch == Constants.SPACE) nextChar();
        Character tmp = (char) ch;
        if (charToEatSet.contains(tmp)) {
            nextChar();
            return true;
        }
        return false;
    }

    // Sonderzeichen
    private boolean eat(char charToEat) {
        while (ch == Constants.SPACE) nextChar();
        if (ch == charToEat) {
            nextChar();
            return true;
        }
        return false;
    }

    private double parseExpression() {
        double x = parseTerm();
        for (;;) {
            if(eat(con.getPrioOne())) x = lib.calc((char)prevch, x, parseTerm());
            else return x;
        }
    }

    private double parseTerm() {
        double x = parseFactor();
        for (;;) {
            if(eat(con.getPrioTwo())) x = lib.calc((char)prevch, x, parseFactor());
            else return x;
        }
    }

    private double parseFactor() {
        if (eat(Constants.NEGATE)) return -parseFactor();// Spezialfall Negation

        double x=0;
        int startPos = this.pos;
        if (ch == Constants.ROOT){// Spezialfall Quadratwurzel
            nextChar();
            x = lib.calc(Constants.NROOTC, 2, parseFactor());
        }
        else
        { 
            if (eat(Constants.PAROPEN)) {
                x = parseExpression();
                eat(Constants.PARCLOSE);
            }
            else if ((ch >= Constants.ZERO && ch <= Constants.NINE) || ch == Constants.DSEPNORM) { // numbers
                while ((ch >= Constants.ZERO && ch <= Constants.NINE) || ch == Constants.DSEPNORM)
                    nextChar();
                x = Double.parseDouble(str.substring(startPos, this.pos));
            }

            if ((char)ch==Constants.QUAD){// Spezialfall Quadrat
                nextChar();
                x = lib.calc(Constants.POWER, x, 2);
            }
            else if (eat(con.getPrioThree())){
                x = lib.calc((char)prevch, x, parseFactor());
            }
        }
        return x;
    }
}
