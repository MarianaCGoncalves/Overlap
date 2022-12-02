package pt.iade.Overlap.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Overlap.models.OnlineEvent;
import pt.iade.Overlap.models.Repositories.OnlineEventRepository;

@RestController 
@RequestMapping(path = "/api/onlineevents") 
public class OnlineEventsController { 
    private Logger logger = LoggerFactory.getLogger(OnlineEventsController.class); 
    @Autowired 
    private OnlineEventRepository onlineeventsRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<OnlineEvent> getOnlineEvents() { 
        logger.info("All online events"); 
        return onlineeventsRepository.findAll(); 
    } 

    //TODO: apenas aparecer os eventos online de um certo grupo. 
}
