package be.ses.javatest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

  @Test
  public void gegevenTeller2Noemer1_wanneerDivide_danResult2() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.divide(2, 1);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(2);
  }

  @Test
  public void gegevenTeller2Noemer4_wanneerDivide_danResult0point5() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.divide(2, 4);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0.5f);
  }

  @Test
  public void gegevenTellerXNoemer0_wanneerDivide_danDivideByZeroException() {
    // when
    Throwable thrown = catchThrowable(() -> {
      // 1. Arrange
      Calculator calculator = new Calculator();

      // 2. Act
      calculator.divide(2, 0);
    });

    // 3. Assert
    assertThat(thrown)
        .isInstanceOf(ArithmeticException.class)
        .hasMessageContaining("/ by zero");
  }

  @Test
  public void gegevenXis2EnYis1_wanneermultiply_danResult2() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.multiply(2, 1);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(2);
  }

  @Test
  public void gegevenXis0EnYis1_wanneermultiply_danResult0() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.multiply(0, 1);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(0);
  }

  @Test
  public void gegevenXis2EnYis1_wanneersubstract_danResult1() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.substract(2, 1);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(1);
  }

  @Test
  public void gegevenXis2EnYis1_wanneeradd_danResult3() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    Float result = calculator.add(2, 1);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(3);
  }

  @Test
  public void gegevenXis4_wanneersquare_danResult2() {
    // 1. Arrange
    Calculator calculator = new Calculator();

    // 2. Act
    double result = calculator.square(4);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(2);
  }

  @Test
  public void gegevenXisNegatif1_wanneersquare_danArithmeticException() {
    // when
    Throwable thrown = catchThrowable(() -> {
      // 1. Arrange
      Calculator calculator = new Calculator();

      // 2. Act
      calculator.square(-1);
    });

    // 3. Assert
    assertThat(thrown)
        .isInstanceOf(ArithmeticException.class)
        .hasMessageContaining("less then 0");
  }
}
