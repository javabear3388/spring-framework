package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring") since componentscan only scan under the package, not hurt, but not needed
 @ComponentScan(basePackages = {"com.spring.proxy", "com.spring.service", "com.spring.repository"})
// add one by one, model not included bc no dependency needed
public class ProjectConfig {

}
