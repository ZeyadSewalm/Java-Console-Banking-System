package banking;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/BANK";
                String user = "root";
                String pass = "Zi010668";

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("DB Connected Successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace(); // 👈 أهم حاجة عشان تشوف الغلط الحقيقي
        }
        return con;
    }
}