package com.springdemo.controller;

import com.springdemo.enums.Gender;
import com.springdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        //use model method
        model.addAttribute("name","model-set-attribute-value");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        //create some random id (1-1000) and show in UI
        int studentID = new Random().nextInt(1000);
        model.addAttribute("id", studentID);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        model.addAttribute("numbers",numbers);

        Student student1 = new Student(1, "Mike", "Smith");
        model.addAttribute("student1", student1);

        return "/student/welcome"; //no need to put .html cause it's thymleaf template
    }
}
