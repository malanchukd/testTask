import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String expr = reader.readLine();

        if (checkBrackets.areBracketsBalanced(expr)) {
            System.out.println("Balanced");
            double result = Calculator.calculation(expr);
            System.out.println("Result is:" + result);
            System.out.println("Count of number is:" + valueOfNumber.countOfNumber(expr));
            DBConnection dbConnection = new DBConnection();
            dbConnection.createConnection();
            dbConnection.createStatement();
            dbConnection.createTable();
            dbConnection.insertTable(expr, result);
            System.out.println("Expression from DB is:" + DBConnection.getExpression(Calculator.calculation(expr)));
            System.out.println("Result from DB is:" + DBConnection.getResult(expr));
            dbConnection.closeStatement();
            dbConnection.closeConnection();
        }
        else
            System.out.println("Not Balanced ");
    }
}
