import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.addition(2, 3));
        assertEquals(10, calculator.addition(5, 5));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sub(5, 3));
        assertEquals(-3, calculator.sub(2, 5));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(-8, calculator.multiply(4, -2));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }

    @Test
    public void testDoubleAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.addition(2.5, 2.5), 0.0001);
        assertEquals(10.0, calculator.addition(5.5, 4.5), 0.0001);
    }

    @Test
    public void testDoubleSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.sub(3.5, 2.5), 0.0001);
        assertEquals(-3.0, calculator.sub(1.0, 4.0), 0.0001);
    }

    @Test
    public void testDoubleMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(12.5, calculator.multiply(2.5, 5.0), 0.0001);
        assertEquals(-8.0, calculator.multiply(2.0, -4.0), 0.0001);
    }

    @Test
    public void testDoubleDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(5.0, 2.5), 0.0001);
        assertEquals(0.5, calculator.divide(1.0, 2.0), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDoubleDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5.0, 0.0);
    }
}
