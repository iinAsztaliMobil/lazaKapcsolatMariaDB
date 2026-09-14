import java.sql.Connection;
import java.sql.ResultSet;
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

    private ArrayList<Employee> tryGetEmployees() throws Exception{
        ArrayList<Employee> empList = new ArrayList<>();

        Connection con = db.connect();
        // System.out.println("connection secure!");
        String sql = "select * from employees";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()){
            String name = rs.getString("name");
            String city = rs.getString("city");
            int salary = rs.getInt("salary");

            Employee emp = new Employee(name, city, salary);
            empList.add(emp);
        }
        con.close();
        return empList;
        
    }

}
