package com.employee_project.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private String department;
    private int hourlyRate;


}