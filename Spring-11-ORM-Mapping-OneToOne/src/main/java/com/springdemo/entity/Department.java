package com.springdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department extends BaseEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private String department;
    private String division;

    @OneToOne(mappedBy = "department") //same name as the employee class
                            // -> will not create column here -> owned by employee table
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }

}
