package com.yash.simpleloginapp.service;

import com.yash.simpleloginapp.exceptions.UserNotFoundException;
import com.yash.simpleloginapp.model.Employee;

public interface EmployeeService {

    Employee findByEmail(String email) throws UserNotFoundException;
}
