import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String expr = reader.readLine();

        if (checkBrackets.areBracketsBalanced(expr)) {
            System.out.println("Balanced");
            System.out.println("Result is:" + Calculator.Calculation(expr));
            System.out.println("Count of number is:" + valueOfNumber.countOfNumber(expr));
        }
        else
            System.out.println("Not Balanced ");
    }
}
