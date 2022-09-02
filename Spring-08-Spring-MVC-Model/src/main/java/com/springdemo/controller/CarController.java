package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")       //localhost:8080/car/info?make=Honda&year=2015
    public String carInfo(@RequestParam String make,@RequestParam Integer year, Model model){

        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }

    @RequestMapping("/info2")       //localhost:8080/car/info?make=Honda&year=2015
    public String carInfo2(@RequestParam(value = "make2",required = false,defaultValue = "Tesla") String make,
                           @RequestParam (value = "year", defaultValue = "12348888") Integer year, Model model){
                            //http://localhost:8080/car/info2?make2=XYZ&year=888

        model.addAttribute("make",make);
        model.addAttribute("year",year);
//        System.out.println(make + "000000000000000"); ==> grab data from browser
        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}")      //localhost:8080/car/info/honda/2015
    public String getCarInfo(@PathVariable String make,@PathVariable Integer year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);

        return "car/car-info";
    }




}
