package com.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String state;

}
