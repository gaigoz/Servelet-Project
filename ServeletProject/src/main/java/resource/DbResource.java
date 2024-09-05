package resource;


import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
    static Connection con;
    public static Connection getDbConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/funfit_db?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "123456");
            return con;
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }


    public static void close() {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
