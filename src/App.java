import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {
        DataService dataservice = new DataService(new MariaDB());
        
        // MariaDB mariadb = new MariaDB();
        // Connection con = mariadb.connect();
    }
}
