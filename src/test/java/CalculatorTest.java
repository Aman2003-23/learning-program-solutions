import org.example.Calculator;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // 🛠️ Arrange: runs before each test
        calculator = new Calculator();
        System.out.println("Setting up Calculator instance...");
    }

    @After
    public void tearDown() {
        // 🧹 Teardown: runs after each test
        System.out.println("Cleaning up after test...");
    }

    @Test
    public void testAddition() {
        // 🧪 Act
        int result = calculator.add(2, 3);

        // ✅ Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}
