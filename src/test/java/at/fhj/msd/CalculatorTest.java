package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {


    @BeforeEach
    public void setUp() {
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd() {
        double res = Calculator.add(1, 2);
        assertEquals(3, res);

        assertEquals(10, Calculator.add(7.5, 2.5));

        assertEquals(100000, Calculator.add(1, 99999));
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus() {
        double res = Calculator.minus(1, 2);
        assertEquals(-1, res);

        assertEquals(5, Calculator.minus(7.5, 2.5));

        assertEquals(-99999, Calculator.minus(1, 100000));
    }

    @DisplayName("Testing divide() method")
    @Test
    public void testDivide() {
        assertEquals(5, Calculator.divide(10, 2));

        double res = Calculator.divide(1, 2);
        assertEquals(0.5, res);

        assertEquals(100, Calculator.divide(100000, 1000));
    }

    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply() {
        double res = Calculator.multiply(6, 5);
        assertEquals(30, res);

        assertEquals(10, Calculator.multiply(2.5, 4));

        assertEquals(14400, Calculator.multiply(120, 120));
    }
}
