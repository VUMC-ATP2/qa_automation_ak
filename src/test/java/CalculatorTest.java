import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(10, 25),35);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(5, 3),2);
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(6, 3),2);
    }
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5, 3),15);
    }
}
