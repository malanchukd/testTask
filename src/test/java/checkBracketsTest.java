import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkBracketsTest {
    checkBrackets checkBrackets;

    @BeforeEach
    void setUp() {
        checkBrackets = new checkBrackets();
    }

    @Test
    @DisplayName("Easy brackets to check")
    void testEasyExpressions() {
        String expr = "()";
        assertEquals(true, checkBrackets.areBracketsBalanced(expr));
    }


    @Test
    @DisplayName("Medium brackets to check")
    void testMediumExpressions() {
        String expr = "{([()])}";
        assertEquals(true, checkBrackets.areBracketsBalanced(expr));
    }

    @Test
    @DisplayName("Hard brackets to check")
    void testHardExpressions() {
        String expr = "(41(4242)413425674{4254353[52453]505153})";
        assertEquals(true, checkBrackets.areBracketsBalanced(expr));
    }
}
