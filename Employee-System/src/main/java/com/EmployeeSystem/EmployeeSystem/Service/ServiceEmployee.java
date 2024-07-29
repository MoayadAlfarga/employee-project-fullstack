package com.EmployeeSystem.EmployeeSystem.Service;

import com.EmployeeSystem.EmployeeSystem.Entity.Employee;

import java.util.List;

public interface ServiceEmployee {
    List<Employee> findAll();

    Employee findById(int Id);

    void save(Employee employee);

    void deleteById(int Id);


}
