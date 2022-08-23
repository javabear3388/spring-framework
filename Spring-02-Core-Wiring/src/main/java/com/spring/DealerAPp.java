package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerAPp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c1 = context.getBean(Car.class);
        Person p1 = context.getBean(Person.class);

        System.out.println("Person's name: "+ p1.getName());
        System.out.println("Car's make: "+ c1.getMake());
        System.out.println("Person's car: "+ p1.getCar());
    }
}
