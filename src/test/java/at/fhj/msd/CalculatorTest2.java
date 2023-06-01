package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest2 {


    @BeforeEach
    public void setUp() {
    }

    @DisplayName("Testing add() method")
    @Test
    public void testAdd() {
        double res = Calculator.add(1, 2);
        assertEquals(3, res);
    }

    @DisplayName("Testing minus() method")
    @Test
    public void testMinus() {
        double res = Calculator.minus(1, 2);
        assertEquals(-1, res);
    }

    @DisplayName("Testing divide() method")
    @Test
    public void testDivide() {
        double res = Calculator.divide(1, 2);
        assertEquals(0.5, res);
        assertThrows(ArithmeticException.class, () -> {
            assertEquals(100, Calculator.divide(10, 0));
        });
    }

    @DisplayName("Testing multiply() method")
    @Test
    public void testMultiply() {
        double res = Calculator.multiply(6, 5);
        assertEquals(30, res);
    }

    @DisplayName("Testing falty() method")
    @Test
    public void testFalty() {
        double res = Calculator.falty(3);
        assertEquals(6, res);
    }
}
