import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {
        MariaDB mariadb = new MariaDB();
        Connection con = mariadb.connect();
    }
}
