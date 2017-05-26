import employee.{Employee, EmployeeResource}
import main.scala.EmployeeService
import org.scalatest.FunSuite

/**
  * Created by bpant on 18/05/17.
  */
class EmployeeSuite extends FunSuite {

  test("should be able to add employee") {
    val employeeService = new EmployeeService(new EmployeeResource())
    assert(employeeService.getEmployees().isEmpty)
    employeeService.addEmployee(new Employee(1, "emp1", 28, 30000f))
    assert(employeeService.getEmployees().size == 1)
  }

  test("should be able to add employee list(scala list to java list)") {
    val employeeService = new EmployeeService(new EmployeeResource())
    val employees = List(new Employee(1, "emp1", 29, 50000f), new Employee(1, "emp2", 21, 30000f))
    employeeService.addAllEmployees(employees)
    assert(employeeService.getEmployees().size == 2)
  }

  test("should be able to get filtered list of employee based on age (java list to scala list)") {
    val employeeService = new EmployeeService(new EmployeeResource())
    val employees = List(new Employee(1, "emp1", 29, 50000f), new Employee(1, "emp2", 21, 30000f), new Employee(1, "emp3", 24, 50000f))
    employeeService.addAllEmployees(employees)
    assert(employeeService.getYoungEmployees(24).size == 2)
  }
}
