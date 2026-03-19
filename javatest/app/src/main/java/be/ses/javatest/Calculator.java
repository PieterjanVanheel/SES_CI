package be.ses.javatest;
import java.lang.Math;

public class Calculator {
    public void Calculater()
    {

    }

    public float divide(float teller, float noemer) {
    if (noemer == 0) {
      throw new ArithmeticException("/ by zero");
    }
    return teller / noemer;
  }

    public float multiply(float x, float y)
    {
        return x*y;
    }

    public float substract(float x, float y)
    {
        return x - y;
    }

    public float add(float x, float y)
    {
        return x + y;
    }

    public double square(double x)
    {
        if (x < 0) {
            throw new ArithmeticException("less then 0");
        }
        return Math.sqrt(x);
    }
}