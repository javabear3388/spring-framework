package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigEmployee.class, AnotherConfig.class);

//        FulltimeEmployee fulltimeEmployee = context.getBean(FulltimeEmployee.class);
//        ParttimeEmployee parttimeEmployee = context.getBean(ParttimeEmployee.class);
//
//        fulltimeEmployee.createAccount();
//        parttimeEmployee.createAccount();

        String str2 = context.getBean("msg2",String.class);
        System.out.println(str2);

        String str1 = context.getBean(String.class);
        System.out.println(str1);

    }



}
