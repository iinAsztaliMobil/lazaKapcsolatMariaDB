import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // DataService dataservice = new DataService(new MariaDB());
        DataService dataservice = new DataService(new SQLite());
        ArrayList<Employee> empList = dataservice.getEmployees();

        empList.forEach(emp -> {
            System.out.println(emp.getSalary()
        );
        });
    }
}
