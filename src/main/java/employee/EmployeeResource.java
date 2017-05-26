package employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bpant on 17/05/17.
 */
public class EmployeeResource {
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employe) {
        employees.add(employe);
    }

    public void addNewEmployees(List<Employee> employees) {
        this.employees.addAll(employees);
    }
}
