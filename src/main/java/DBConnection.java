import java.sql.*;

public class DBConnection {
    private Connection connection;
    private static Statement statement;

    public void createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalTask",
                "postgres", "1342");
    }

    public void closeConnection() {
        try{
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createStatement() throws SQLException {
        statement = connection.createStatement();
    }
    public void closeStatement() {
        try {
            if (statement != null) statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable() throws SQLException {
        String sql = "CREATE TABLE  ResultTable " +
                " (expressions VARCHAR(250)," +
                " result double precision)";
        statement.execute(sql);
    }

    public void dropTable() throws SQLException {
        String sql = "DROP TABLE ResultTable";
        statement.execute(sql);
    }

    public void insertTable(String expression, double result) throws SQLException {
        statement.execute("INSERT INTO ResultTable (expressions, result) VALUES ('"
                + expression + "', " + result + ");");
    }
    public static String getExpression(double result) throws SQLException {
        ResultSet resultSet = statement
                .executeQuery("SELECT expressions FROM ResultTable WHERE result ='" + result + "';");
        String results = "";
        if (resultSet.next()) {
            results = resultSet.getString(1);
        }
        resultSet.close();
        return results;
    }
    public static int getResult(String expressions) throws SQLException {
        ResultSet resultSet = statement
                .executeQuery("SELECT result FROM ResultTable WHERE expressions ='" + expressions + "';");
        int result =-1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }
}
