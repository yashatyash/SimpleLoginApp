package com.yash.simpleloginapp.repo;

import com.yash.simpleloginapp.exceptions.UserNotFoundException;
import com.yash.simpleloginapp.mapper.EmployeeMapper;
import com.yash.simpleloginapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public Employee findByEmail(String email) throws UserNotFoundException {
        try {
            return jdbcTemplate.queryForObject("select * from employee where email=?",new Object[]{email},new EmployeeMapper());
        }
        catch (DataAccessException e)
        {
            throw new UserNotFoundException("User with email: "+email+" not found !!",email);
        }
    }
}
