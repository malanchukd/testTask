import java.util.ArrayDeque;
import java.util.Deque;

public class checkBrackets {

    static boolean areBracketsBalanced(String expr) {
        boolean result = false;
        String withoutNumber = expr.replaceAll("[0-9][-+*/]", "").trim();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < withoutNumber.length(); i++) {
            char x = withoutNumber.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }

        if(stack.isEmpty()) result = true;
        return (result);
    }
}
