package com.spring.service;

import com.spring.model.Comment;
import com.spring.proxy.CommentNotificationProxy;
import com.spring.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @Value("${name}")
    private static String x;

    @Value("${days}")
    private static String[] y;

    @Value("zzz")
    private static String z;

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

//    @Autowired // No Need if only one constructor in the class
    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

    public static void main(String[] args) {
        System.out.println(z);
    }
}
