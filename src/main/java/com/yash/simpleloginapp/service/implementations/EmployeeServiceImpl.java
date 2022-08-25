package com.yash.simpleloginapp.service.implementations;

import com.yash.simpleloginapp.exceptions.UserNotFoundException;
import com.yash.simpleloginapp.model.Employee;
import com.yash.simpleloginapp.repo.EmployeeRepo;
import com.yash.simpleloginapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee findByEmail(String email) throws UserNotFoundException {
        return employeeRepo.findByEmail(email);
    }
}
