package com.employee_project.repository;

import com.employee_project.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository{


    //Assume we are getting data from the DB
    @Override
    public int getHourRate() {
        Employee e1 = new Employee("Mike", "IT", 50);
        return e1.getHourlyRate();
    }
}
