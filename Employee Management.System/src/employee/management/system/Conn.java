package employee.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String dbUrl = System.getenv("DB_URL");
            String dbUser = System.getenv("DB_USER");
            String dbPassword = System.getenv("DB_PASSWORD");

            c = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
