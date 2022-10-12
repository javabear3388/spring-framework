package com.springdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "students") //custom table name
public class Student { //default table name

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName") //-> student_first_name
    private String firstName; //at db column name -> first_name
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

}
