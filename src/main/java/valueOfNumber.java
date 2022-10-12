public class valueOfNumber {
    public static int countOfNumber(String expr) {
        int count = 0;
        for (int i = 0; i < expr.length(); i++) {
            if (Character.isDigit(expr.charAt(i)))
                count++;
        }
        return count;
    }
}
