import java.sql.ResultSet;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        ResultSet resultSet = TestConnection.statement.executeQuery("SELECT * from world");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2) +
                    resultSet.getString(3));
        }
    }
}