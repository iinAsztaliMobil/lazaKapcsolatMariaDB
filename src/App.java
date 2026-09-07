import java.sql.Connection;

@SuppressWarnings("unused")
public class App {
    public static void main(String[] args) throws Exception {
        // DataService dataservice = new DataService(new MariaDB());
        DataService dataservice = new DataService(new SQLite());
        
        // MariaDB mariadb = new MariaDB();
        // Connection con = mariadb.connect();
    }
}
