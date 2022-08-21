package com.spring.bean_annotation;

import org.springframework.context.annotation.Bean;

public class ConfigAny {

    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    Integer number(){
        return 108;
    }

}
