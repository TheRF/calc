import java.lang.Math;

class MathLib{
  public double calc(char operator, double lnum, double rnum){
  		if (operator==Constants.PLUS)
  			return addition(lnum, rnum);
      else if (operator==Constants.MINUS)
        return addition(lnum, -rnum);
      else if (operator==Constants.MULTIPLY)
        return multiplication(lnum, rnum);
      else if (operator==Constants.DIVIDE)
        return multiplication(lnum, 1/rnum);
      else if (operator==Constants.POWER)
        return power(lnum, rnum);
      else if (operator==Constants.NROOTC)
        return root(lnum, rnum);

      return 0;
  }

  private double addition(double lnum, double rnum){
  	return lnum+rnum;
  }
  private double multiplication(double lnum, double rnum){
  	return lnum*rnum;
  }

  private double root(double degree, double rnum){
    double x0 = 1;
    int steps = 100;

    while(steps>0){
      x0 = (1/degree)*((degree-1)*x0+(rnum/(Math.pow(x0, degree-1))));
      steps--;
    }

    return x0;
  }

  private double power(double base, double degree){
  	return Math.pow(base, degree);
  }
}
