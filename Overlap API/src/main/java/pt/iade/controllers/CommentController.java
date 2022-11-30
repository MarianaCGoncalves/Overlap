package pt.iade.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.models.Comment;
import pt.iade.models.Repositories.CommentRepository;

@RestController 
@RequestMapping(path = "/api/comment") 
public class CommentController { 
    private Logger logger = LoggerFactory.getLogger(CommentController.class); 
    @Autowired 
    private CommentRepository commentRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<Comment> getComment() { 
        logger.info("All Comments"); 
        return commentRepository.findAll(); 
    } 
}