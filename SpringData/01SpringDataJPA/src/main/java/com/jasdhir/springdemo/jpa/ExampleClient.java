package com.jasdhir.springdemo.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component

public class ExampleClient {

    @Autowired
    private EmployeeRepository repo;

    public void run() {
        List<Employee> employees = createEmployees();

        System.out.println(" -- saving employees --");
        System.out.println(employees);
        repo.saveAll(employees);

        System.out.println(" -- finding all employees --");
        Iterable<Employee> all = repo.findAll();
        System.out.println(all);

        if (repo.existsById(1L)) {
            System.out.println("-- finding by id --");
            Optional<Employee> employeeOptional = repo.findById(1L);
            Employee employee = employeeOptional.orElseThrow(RuntimeException::new);
            System.out.println(employee);

            System.out.println("-- deleting --");
            System.out.println(employee);
            repo.delete(employee);
        }

        if (repo.existsById(2L)) {
            System.out.println("-- updating --");
            Employee employee2 = repo.findById(2L).orElseThrow(RuntimeException::new);
            System.out.println(employee2);
            employee2.setDept("IT");
            repo.save(employee2);
        }

        System.out.println(" -- finding all employees again --");
        Iterable<Employee> all2 = repo.findAll();
        System.out.println(all2);
    }

    private List<Employee> createEmployees() {
        return Arrays.asList(
                Employee.create("Diana", "Admin"),
                Employee.create("Mike", "Sale"),
                Employee.create("Rose", "IT")
        );

    }
}
