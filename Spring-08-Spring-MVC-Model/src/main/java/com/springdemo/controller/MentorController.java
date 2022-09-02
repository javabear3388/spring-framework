package com.springdemo.controller;

import com.springdemo.enums.Gender;
import com.springdemo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentorinfo") //Class level controller => /mentorinfo/xxx
public class MentorController {

    @RequestMapping("/mentors")
    public String mentor(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.MALE));
        mentorList.add(new Mentor("Ammy","Bryan",25, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);
        model.addAttribute("mentorFirst", mentorList.get(0).getFirstName());

        return "mentor/mentor";
    }
}
