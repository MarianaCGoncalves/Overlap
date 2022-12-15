package pt.iade.Overlap.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Overlap.models.OnlineEvent;
import pt.iade.Overlap.models.Repositories.OnlineEventRepository;
import pt.iade.Overlap.models.exceptions.NotFoundException;
import pt.iade.Overlap.models.views.OnlineEventView;

@RestController 
@RequestMapping(path = "/api/onlineevents") 
public class OnlineEventsController { 
    private Logger logger = LoggerFactory.getLogger(OnlineEventsController.class); 
    @Autowired 
    private OnlineEventRepository onlineeventsRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
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
}
