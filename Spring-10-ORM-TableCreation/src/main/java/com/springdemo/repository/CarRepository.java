package com.springdemo.repository;

import com.springdemo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Long> { //class, id
    //lots methods in JpaRepository already
    //can add more

}
