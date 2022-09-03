package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnotherConfig {

    @Bean(name = "msg1")
    @Primary
    public String str1(){
        return "Welcome to Employee App!";
    }

    @Bean(name = "msg2")
    public String str2(){
        return "Spring Core Practice";
    }


}
