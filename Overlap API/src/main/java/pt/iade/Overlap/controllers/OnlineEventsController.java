package pt.iade.Overlap.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pt.iade.Overlap.models.Repositories.OnlineEventRepository;
import pt.iade.Overlap.models.views.OnlineEventEveView;

@RestController 
@RequestMapping(path = "/api/onlineevents") 
public class OnlineEventsController { 
    private Logger logger = LoggerFactory.getLogger(OnlineEventsController.class); 
    @Autowired 
    private OnlineEventRepository onlineeventsRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<OnlineEventEveView> getOnlineEvents() { 
        logger.info("All online events"); 
        return onlineeventsRepository.getOnlineEvents();
    } 

    @GetMapping(path = "/group/id/{gru_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<OnlineEventEveView> getOnlineEventsByGroupId(@PathVariable int gru_id){
        logger.info("Sending all online events with group id "+gru_id);
        return onlineeventsRepository.getOnlineEventsByGroup(gru_id);
    }

    @GetMapping(path = "/group/name/{gru_name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<OnlineEventEveView> getOnlineEventsByGroupName(@PathVariable String gru_name){
        logger.info("Sending all online events with group name: "+gru_name);
        return onlineeventsRepository.getOnlineEventsByGroupName(gru_name);
    }

    // @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    // public OnlineEventEveView createOnlineEvent(@RequestBody Event event, OnlineEvent onlineevent){
        
    // }
}
