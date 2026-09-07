import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class DataService {

    Database db;

    public DataService(Database db){
        this.db = db;
    }

     public ArrayList<Employee> getEmployees(){
        try {
            return tryGetEmployees();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
     }

    public ArrayList<Employee> tryGetEmployees() throws Exception{
        ArrayList<Employee> empList = new ArrayList<>();

        //feltoltes
        Connection con = db.connect();
        String sql = "select * from employees";

        Statement stmt = con.createStatement();

        return empList;
    }
}
