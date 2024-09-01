package com.jasdhir.spring.rest.mvc.service;
import com.jasdhir.spring.rest.mvc.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  // List<Employee> employeeList= Arrays.asList(
	List<Employee> employeeList=new ArrayList<Employee>( Arrays.asList(
      new Employee("spiderman","Peter Parker","New York"),
      new Employee("batman","Bruce Wayne","Gotham City"),
      new Employee("superman","Clark Kent","Metropolis"),
      new Employee("blackpanther","T'Challa","Wakanda"),
      new Employee("ironman","Tony Stark","New York")
   ));
   public List<Employee> getEmployees(){
      return employeeList;
   }
   public Employee getEmployee(String id){
      return employeeList.stream().filter(e->e.getId()
         .equals(id)).findFirst().get();
   }
   public void addEmployee(Employee employee){
	   System.out.println(employee.getId());
	   employeeList.add(employee);
   }
   public void updateEmployee(Employee employee, String id){
      for(int i=0;i<employeeList.size();i++){
         Employee e=employeeList.get(i);
         if(e.getId().equals(id)) {
            employeeList.set(i, employee);
            break;
         }
      }
   }
   public void deleteEmployee(String id){
      employeeList.removeIf(e->e.getId().equals(id));
   }
}