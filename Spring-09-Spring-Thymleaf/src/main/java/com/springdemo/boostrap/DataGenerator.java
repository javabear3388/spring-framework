package com.springdemo.boostrap;

import com.github.javafaker.Faker;
import com.springdemo.model.Student;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Student> createStudent(){

        List<Student> students = Arrays.asList(
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                Student.builder().firstName(new Faker().name().firstName()).lastName(new Faker().name().lastName())
                        .age(new Faker().number().numberBetween(20, 50)).state(new Faker().address().state()).build()
        );

        return students;
    }

}
