import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class valueOfNumberTest {
    valueOfNumber valueOfNumber;

    @BeforeEach
    void setUp() {
        valueOfNumber = new valueOfNumber();
    }

    @Test
    @DisplayName("Easy test to count value")
    void testEasyCount() {
        String expr = "4135";
        assertEquals(4, valueOfNumber.countOfNumber(expr));
    }

    @Test
    @DisplayName("Medium test to count value")
    void testMediumCount() {
        String expr = "4153465354";
        assertEquals(10, valueOfNumber.countOfNumber(expr));
    }

    @Test
    @DisplayName("Hard test to count value")
    void testHardCount() {
        String expr = "(415346hfg53545245780367)";
        assertEquals(20, valueOfNumber.countOfNumber(expr));
    }
}
