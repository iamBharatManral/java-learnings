package dev.thelogguy;

import model.Comment;
import services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       var commentService = context.getBean(CommentService.class);
       var comment = new Comment("Demo comment", "Bharat manral");
       commentService.publishComment(comment);
    }
}