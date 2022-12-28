package pt.iade.Overlap.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
=======
>>>>>>> mariana
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pt.iade.Overlap.models.Repositories.OnlineEventRepository;
<<<<<<< HEAD
import pt.iade.Overlap.models.views.OnlineEventEveView;
=======
import pt.iade.Overlap.models.exceptions.NotFoundException;
import pt.iade.Overlap.models.views.OnlineEventView;
>>>>>>> mariana

@RestController 
@RequestMapping(path = "/api/onlineevents") 
public class OnlineEventsController { 
    private Logger logger = LoggerFactory.getLogger(OnlineEventsController.class); 
    @Autowired 
    private OnlineEventRepository onlineeventsRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
<<<<<<< HEAD
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
=======
    public Iterable<OnlineEventView> getOnlineEvents() { 
        logger.info("All online events"); 
        Iterable<OnlineEventView> _ONevent = onlineeventsRepository.getAllInfoOnlineEvents();
        if(_ONevent == null) throw new NotFoundException(null, null, null);
        else return _ONevent;
    } 

    // @GetMapping(path = "/group/{gru_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // public Iterable<OnlineEvent> getOnlineEventsByGroup(@PathVariable int gru_id){
    //     logger.info("Returning all online events by group with id "+gru_id);
    //     Iterable<OnlineEvent> ONevent = onlineeventsRepository.getOnlineEventsByGroup(gru_id);
    //     return ONevent;
    // }

    //TODO: apenas aparecer os eventos online de um certo grupo. 
>>>>>>> mariana
}
