package com.employee_project;

import com.employee_project.config.ConfigApp;
import com.employee_project.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SalaryApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        SalaryService salaryService = context.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

    }
}
