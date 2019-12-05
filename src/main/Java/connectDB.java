
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class connectDB {

    public connectDB() throws SQLException {


        String dbUrl = System.getenv("JDBC_DATABASE_URL") ;
        try {
            // Registers the driver
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
        }




        Connection conn = DriverManager.getConnection(dbUrl);

    }
}