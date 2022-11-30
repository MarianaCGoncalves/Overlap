package pt.iade.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.models.Message;
import pt.iade.models.Repositories.MessageRepository;

@RestController 
@RequestMapping(path = "/api/message") 
public class MessageController { 
    private Logger logger = LoggerFactory.getLogger(MessageController.class); 
    @Autowired 
    private MessageRepository messageRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<Message> getMessage() { 
        logger.info("All messages "); 
        return messageRepository.findAll(); 
    } 

    @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message newMessage(@RequestBody Message message){
    logger.info("MessageId: " +message.getMessageId());
    logger.info("Content of the message: "+message.getMessageText());
    return messageRepository.save(message);
    }

    @PutMapping(path = "/edit/{mes_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String editMessage(@PathVariable int mes_id, @RequestBody Message message){
        Message editedMessage = messageRepository.findById(mes_id).get();
        editedMessage.setMessageText(message.getMessageText());
        return "Message edited";
    }

    @DeleteMapping(path = "delete/{mes_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteMessage(@PathVariable int mes_id){
        Message deletedMessage = messageRepository.findById(mes_id).get();
        messageRepository.delete(deletedMessage);
        return "Delete message with the id" + mes_id;
        
    }
}