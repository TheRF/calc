class MathLib{
  public double calc(char operator, double lnum, double rnum){
  		if (operator==Constants.PLUS)
  			return addition(lnum, rnum);

      return 0;
  }

  private double addition(double lnum, double rnum){
  	return lnum+rnum;
  }
  private double multiplication(double lnum, double rnum){
  	return lnum*rnum;
  }

  private double root(double degree, double rnum){
  	return 0;
  }
  private double power(double base, double degree){
  	return 0;
  }
}
