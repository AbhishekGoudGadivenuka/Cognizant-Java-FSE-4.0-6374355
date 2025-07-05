package W2_JUnit_Mockito.JUNITExercises.Exc1_Setup_Basic;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(3, 5);
        System.out.println("Result of addition: " + result);
        assertEquals(8, result);
    }
}
