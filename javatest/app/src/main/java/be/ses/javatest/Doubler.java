package be.ses.javatest;

public class Doubler {

  public float doubleCalculator(Calculator calculator, String operation, float x, float y) {
    if (operation == "divide") {
      return calculator.divide(x, y) * 2;
    } else {
      throw new UnsupportedOperationException("Wrong calculator operation selected");
    }
  }

}
