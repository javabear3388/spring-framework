package com.springdemo.repository;

import com.springdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Display all employees with email address ''
    List<EmployeeRepository> findByEmail(String email);

    //Display all employees with first name ' ' and last name ' ' , also show all employees with an email address
    List<EmployeeRepository> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display all employees with first name is NOT ''
    List<EmployeeRepository> findByFirstNameIsNot(String notFirstName);

    //Display all employees where last name starts with ''
    List<EmployeeRepository> findByLastNameStartsWith(String keyword);

    //Display all employees with salaries > ''
    List<EmployeeRepository> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ' '
    List<EmployeeRepository> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between '' and  ''
    List<EmployeeRepository> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries grater and equal to '' IN ORDER
    List<EmployeeRepository> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less thatn ''
    List<EmployeeRepository> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<EmployeeRepository> findByEmailIsNull();




}
