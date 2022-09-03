package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigEmployee.class);

        FulltimeEmployee fulltimeEmployee = context.getBean(FulltimeEmployee.class);
        ParttimeEmployee parttimeEmployee = context.getBean(ParttimeEmployee.class);

        fulltimeEmployee.createAccount();
        parttimeEmployee.createAccount();
    }



}
