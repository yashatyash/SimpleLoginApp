package com.yash.simpleloginapp.controller;

import com.yash.simpleloginapp.exceptions.UserNotFoundException;
import com.yash.simpleloginapp.model.Employee;
import com.yash.simpleloginapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String login(ModelMap modelMap)
    {
        Employee employee = new Employee();
        modelMap.addAttribute("employee",employee);
        System.out.println("hello fired");
        return "loginPage";
    }

    @PostMapping("/")
    public ModelAndView loginStatus(@ModelAttribute("employee") Employee employee) throws UserNotFoundException {
        ModelAndView modelAndView = new ModelAndView();
        Employee byEmail = employeeService.findByEmail(employee.getEmail());
        if (byEmail.getEmail()!=null)
            modelAndView.setViewName("success");
        return modelAndView;
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ModelAndView userNotFoundView(UserNotFoundException notFoundException)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("invalidEmail",notFoundException.getEmail());
        modelAndView.addObject("message",notFoundException.getMessage());
        modelAndView.setViewName("userNotFound");
        return modelAndView;
    }
}
