package com.spring.stereotype_annotation;

import com.spring.bean_annotation.FullTimeMentor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan //only get beans in the same package
@ComponentScan(basePackages = "com.spring") //can get beans outside the package under the moduel
public class ConfigCourse {

    // NO NEED
//    @Bean
//    FullTimeMentor fullTimeMentor(){
//        return new FullTimeMentor();
//    }

}
