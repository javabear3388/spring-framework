package com.springdemo.entity;

import com.springdemo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Employees")
@Data
@NoArgsConstructor
public class Employee extends BaseEntity{

//    @Id
//    private int employeeId;

    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    private int salary;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    //one employee can only have ONE dept
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id") //change the name of the join column (foreign key)
    private Department department;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.salary = salary;
        this.gender = gender;
    }
}
