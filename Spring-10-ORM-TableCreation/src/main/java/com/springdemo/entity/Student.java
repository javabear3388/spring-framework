package com.springdemo.entity;

import com.springdemo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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

    @Transient ////not persistent
    private String city;

    @Column(columnDefinition = "DATE") //type of data in this column
    private LocalDate birthdate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
