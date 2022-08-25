package com.spring;

import com.spring.config.ProjectConfig;
import com.spring.model.Comment;
import com.spring.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//        System.out.println(cs1 == cs2); // true => singleton

//        //Add @Scope: prototype
//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//        System.out.println(cs1 == cs2); //false ==> 2 obj created





    }
}
