package com.spring;

import com.spring.model.Comment;
import com.spring.service.CommentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {


        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring framework");

        ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
    }

}
