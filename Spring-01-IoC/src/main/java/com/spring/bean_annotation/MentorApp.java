package com.spring.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MentorApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

//        String s1 = container.getBean(String.class);
//        System.out.println(s1);
//
//        Integer i1 = container.getBean(Integer.class);
//        System.out.println(i1);

        PartTimeMentor pt2 = container.getBean("p2",PartTimeMentor.class); //p2
        pt2.createAccount();

        PartTimeMentor pt1 = container.getBean(PartTimeMentor.class); //p1 -> primary
        pt1.createAccount();

    }
}
