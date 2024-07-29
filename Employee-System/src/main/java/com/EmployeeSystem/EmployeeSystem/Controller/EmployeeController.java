package com.EmployeeSystem.EmployeeSystem.Controller;

import com.EmployeeSystem.EmployeeSystem.Entity.Employee;
import com.EmployeeSystem.EmployeeSystem.Service.ServiceEmployee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Employees")
public class EmployeeController {

    private final ServiceEmployee serviceEmployee;

    public EmployeeController(ServiceEmployee serviceEmployee) {
        this.serviceEmployee = serviceEmployee;
    }

    @GetMapping("/List")
    public String listEmployee(Model model) {
        List<Employee> employee = serviceEmployee.findAll();
        model.addAttribute("Employees", employee);
//        return "View/list";
        return "View/List-Employees";
    }

    @GetMapping("/Show")
    public String showForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("Employees", employee);
        return "View/Employee-form";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("employee") Employee employee) {
        serviceEmployee.save(employee);
        return "redirect:/Employees/List";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int Id) {
        serviceEmployee.deleteById(Id);
        return "redirect:/Employees/List";
    }

    @GetMapping("/ShowUpdate")
    public String showUpdate(@RequestParam("employeeId") int Id, Model model) {
        Employee employee = serviceEmployee.findById(Id);
        model.addAttribute("Employees", employee);
        return "View/Employee-form";
    }
}
