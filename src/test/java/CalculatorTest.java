import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Easy expression to check")
    void testEasyExpressions() {
        String expr = "4+(5-2)*2";
        assertEquals(10, calculator.calculation(expr));
    }

    @Test
    @DisplayName("Medium expression to check")
    void testMediumExpressions() {
        String expr = "(4214*12/(41342-14324))/4";
        assertEquals(0.46791028203419943, calculator.calculation(expr));
    }

    @Test
    @DisplayName("Hard expression to check")
    void testHardExpressions() {
        String expr = "5^3-sin(30)+cos(60)-(124*(3*53/159))";
        assertEquals(1, calculator.calculation(expr));
    }
}
