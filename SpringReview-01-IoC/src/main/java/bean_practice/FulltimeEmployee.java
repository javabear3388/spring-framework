package bean_practice;

import org.springframework.stereotype.Component;

//@Component ==> No need here since ComponentScan in ConfigHour also scan @Beans at ConfigEmployee
public class FulltimeEmployee {

    public void createAccount(){
        System.out.println("FT employee creating account");
    }
}
