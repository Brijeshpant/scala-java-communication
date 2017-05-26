package main.scala

import employee.{Employee, EmployeeResource}
import scala.collection.JavaConverters._
import scala.collection.JavaConversions._

/**
  * Created by bpant on 17/05/17.
  */

class EmployeeService(employeeProvider: EmployeeResource) {

  def addEmployee(employee: Employee) = {
    employeeProvider.addEmployee(employee)
  }

  def addAllEmployees(employees: List[Employee]) = {
    val employeeList: java.util.List[Employee] = employees
    employeeProvider.addNewEmployees(employeeList)
  }

  def getYoungEmployees(minimumAge: Int): List[Employee] = {
    val employees = employeeProvider.getEmployees.asScala.toList
    employees.filter(_.getAge >= minimumAge)
  }


  def getEmployees(): List[Employee] = {
    employeeProvider.getEmployees.asScala.toList
  }
}
