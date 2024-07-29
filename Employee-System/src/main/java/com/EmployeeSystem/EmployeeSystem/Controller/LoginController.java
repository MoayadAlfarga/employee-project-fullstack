package com.EmployeeSystem.EmployeeSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/LoginPage")
    public String showMyLoginPage() {
        return "View/fancy-login";
    }

}

