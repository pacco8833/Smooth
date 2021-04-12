import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleSingleton {

    private static Connection conn = null;
    private static SampleSingleton instance = null;
    private BigDecimal input;

    // private constructor prevents other classes from running SampleSingleton
    private SampleSingleton() {
        databaseQuery(input);
    }

    public static SampleSingleton getInstance() {
        // make sure only 1 instance exitsts
        return (instance == null) ? new SampleSingleton() : instance;
    }

    public static void databaseQuery(BigDecimal input) {
        try {
            conn = DriverManager.getConnection("url/to/database");
            // more believeable url
            Statement st = conn.createStatement();
            // properly format sql keywords
            ResultSet rs = st.executeQuery("SELECT id FROM table");
            int x = 0;
            while (rs.next()) {
                // big decimal must be converted to int
                x = rs.getInt(1) * input.intValue();
                // Do something with x ?
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e + " needs to be handled more gracefully");
        }
    }
}