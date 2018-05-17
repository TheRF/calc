class TestTruncate{
	public static void main(String[] argv){
		TestFuncs.Trunc("3.0");
		TestFuncs.Trunc("1.7");
		TestFuncs.Trunc("-0.34");
		TestFuncs.Trunc("-0.35078000");
	}
}