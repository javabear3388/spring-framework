package com.employee_project.service;

import com.employee_project.repository.EmployeeRepository;
import com.employee_project.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public SalaryService(EmployeeRepository employeeRepository, @Qualifier("regularHours") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        int total = employeeRepository.getHourRate()* hoursRepository.getHours();
        System.out.println(total);
    }
}
