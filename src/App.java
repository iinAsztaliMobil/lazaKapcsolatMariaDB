public class App {
    public static void main(String[] args) throws Exception {

        DataService dataservice = new DataService(new SQLite());
        dataservice.getEmployees();
    }
}
