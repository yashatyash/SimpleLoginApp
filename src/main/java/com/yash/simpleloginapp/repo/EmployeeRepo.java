package com.yash.simpleloginapp.repo;

import com.yash.simpleloginapp.exceptions.UserNotFoundException;
import com.yash.simpleloginapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo {

    Employee findByEmail(String email) throws UserNotFoundException;
}
