package W2_JUnit_Mockito.JUNITExercises.Exc4_AAAPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    private Calculator calculator;

    // Setup method: runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup done.");
    }

    // Teardown method: runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown done.");
    }

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int a = 4;
        int b = 5;
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }
}
