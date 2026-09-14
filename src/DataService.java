import java.io.BufferedReader;
import java.io.FileReader;
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

    public ArrayList<Employee> tryGetEmployees() throws Exception{
        ArrayList<Employee> empList = new ArrayList<>();

        //feltoltes
        Connection con = db.connect();
        System.out.println("connection secure!");
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
        return empList;
    }

// public void importDataFromSqlFile(String filePath) {
//         try (Connection con = db.connect();
//              Statement stmt = con.createStatement();
//              BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

//             StringBuilder sqlBuilder = new StringBuilder();
//             String line;

//             while ((line = reader.readLine()) != null) {
//                 String trimmedLine = line.trim();
//                 // Skip empty lines and SQL comments
//                 if (trimmedLine.isEmpty() || trimmedLine.startsWith("--")) {
//                     continue;
//                 }

//                 sqlBuilder.append(line).append(" ");

//                 // When reaching a semicolon, execute the statement
//                 if (trimmedLine.endsWith(";")) {
//                     stmt.execute(sqlBuilder.toString());
//                     sqlBuilder.setLength(0);
//                 }
//             }

//             System.out.println("Data successfully imported from " + filePath);

//         } catch (Exception e) {
//             System.err.println("Failed to import SQL file: " + e.getMessage());
//         }
//     }
}
