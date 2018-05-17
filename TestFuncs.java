class TestFuncs{
	public static void Output(char operator, double lnum, double rnum){
		System.out.println("======================================");
		System.out.println("vals: "+Double.toString(lnum)+"     "+Double.toString(rnum));
		System.out.println("operator: "+operator);

		MathLib lib = new MathLib();
		System.out.println("result: "+Double.toString(lib.calc(operator, lnum, rnum)));
	}

	public static void Parse(String formula){
		System.out.println("======================================");
		System.out.println("input string: "+formula);
		Parser p = new Parser();
		double d = p.parse(formula);
		System.out.println("output value: "+Double.toString(d));
	}

	public static void Trunc(String number){
		System.out.println("======================================");
		System.out.println("input value: "+number);
		number = CalcStringFuncs.truncFloatVal(number);
		System.out.println("output value: "+number);
	}
}