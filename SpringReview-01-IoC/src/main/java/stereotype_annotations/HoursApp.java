package stereotype_annotations;

import bean_practice.FulltimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.ConfigHours;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.MicroService;

public class HoursApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigHours.class);

        DataStructure dt = context.getBean(DataStructure.class);
        dt.getTotalHours();

        MicroService ms = context.getBean(MicroService.class);
        ms.getTotalHours();

        FulltimeEmployee ft = context.getBean(FulltimeEmployee.class);
        ft.createAccount();

    }
}
