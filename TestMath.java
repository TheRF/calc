class TestMath{
	private static void Output(char operator, double lnum, double rnum){
		System.out.println("======================================");
		System.out.println("vals: "+Double.toString(lnum)+"     "+Double.toString(rnum));
		System.out.println("operator: "+operator);

		MathLib lib = new MathLib();
		System.out.println("result: "+Double.toString(lib.calc(operator, lnum, rnum)));
	}

	public static void main(String[] argv){
		Output('+', 23, 2.2);
		Output('-', 6, 98);
		Output('*', 6, 4);
		Output('/', 6, 3);
		Output('^', 3, 3);
		Output('r', 3, 27);
	}
}