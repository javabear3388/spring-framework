package com.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id //primary key
    private int id;
    private String name;

}
