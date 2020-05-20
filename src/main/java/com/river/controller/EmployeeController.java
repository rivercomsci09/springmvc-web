package com.river.controller;

import com.river.domain.Employee;
import com.river.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    @RequestMapping("/viewAllEmployees")
//    public ModelAndView viewAllItems() {
//        List<Employee> allEmployees = employeeService.getAllEmployees();
//        return new ModelAndView("/displayAllEmployees", "allEmployees",
//                allEmployees);
//    }

//    @RequestMapping(value = "/viewAllEmployees", method = RequestMethod.GET)
//    public String getAllEmployees(Model model){
//        model.addAttribute("employees", employeeService.getAllEmployees());
//        return "/displayAllEmployees";
//    }

    @RequestMapping("/viewAllEmployees")
    public ModelAndView viewAllItems() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return new ModelAndView("displayAllEmployees", "allEmployees",
                allEmployees);
    }
}
