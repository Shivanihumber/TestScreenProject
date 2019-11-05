import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {


    private List<Employee> employeeList;

    public EmployeeManager() {
        this.employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("shivani", 25, 5600));
        employeeList.add(new Employee("niki", 35, 5000));
        employeeList.add(new Employee("ferda", 29, 7600));
        employeeList.add(new Employee("jasleen", 20, 5400));
        employeeList.add(new Employee("Kanak", 20, 5100));
    }

    public void showEmployeeInfo() {

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
