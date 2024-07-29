package com.EmployeeSystem.EmployeeSystem.Service;

import com.EmployeeSystem.EmployeeSystem.EmployeeRepsotory.EmployeeRepository;
import com.EmployeeSystem.EmployeeSystem.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplement implements ServiceEmployee {
    private final EmployeeRepository employeeRepository;

    public ServiceImplement(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int Id) {
        return employeeRepository.findById(Id)
                  .orElseThrow(() -> new RuntimeException("Did not Find ID " + Id));
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int Id) {
        employeeRepository.deleteById(Id);
    }
}
