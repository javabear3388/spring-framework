package com.springdemo.model;

import com.springdemo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student { //POJOs don't get @Component. only the classes with dependency
    private int id;
    private String firstName;
    private String lastName;

}
