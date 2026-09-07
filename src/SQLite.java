import java.sql.Connection;
import java.sql.DriverManager;

public class SQLite implements Database {
    public Connection connect(){
        try {
            return tryConnect();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    public Connection tryConnect() throws Exception{
        String url = "jdbc:sqlite:database.sqlite";
        return DriverManager.getConnection(url);
    }
}
