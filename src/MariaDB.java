import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDB implements Database{

    private String host = "localhost";
    private String port = "3306";
    private String dbName = "bama";
    private String user = "bama";
    private String pwd = "titok";

    public Connection connect(){
        try {
            return tryConnect();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Connection tryConnect() throws Exception{
        String url = "jdbc:mariadb://" + host + ":" + port + "/" + dbName;
        return DriverManager.getConnection(url, user, pwd);
    }
}
