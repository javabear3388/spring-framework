package com.springdemo.controller;

import com.springdemo.boostrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

//    @RequestMapping(value = "/register", method= RequestMethod.GET) //GET is default
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }

//    @RequestMapping("/welcome")
    @GetMapping("/welcome")
    public String welcom(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/welcome";
    }


}
