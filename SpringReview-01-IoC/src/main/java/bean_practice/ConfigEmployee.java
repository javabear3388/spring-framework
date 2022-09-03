package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigEmployee {

    @Bean
    FulltimeEmployee fulltimeEmployee(){
        return new FulltimeEmployee();
    }

    @Bean
    ParttimeEmployee parttimeEmployee(){
        return new ParttimeEmployee();
    }

}
