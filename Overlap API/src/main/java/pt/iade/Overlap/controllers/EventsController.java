package pt.iade.Overlap.controllers;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Overlap.models.Event;
import pt.iade.Overlap.models.OnlineEvent;
import pt.iade.Overlap.models.PhysicalEvent;
import pt.iade.Overlap.models.Repositories.OnlineEventRepository;
import pt.iade.Overlap.models.Repositories.PhysicalEventRepository;


@RestController 
@RequestMapping(path = "/api/events")
public class EventsController {
    private Logger logger = LoggerFactory.getLogger(EventsController.class); 

    @Autowired 
    private OnlineEventRepository onlineEventRepository;

    @Autowired 
    private PhysicalEventRepository physicalEventRepository;

@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public <EventView> List<Event> getEvents(){
    logger.info("All events!"); 
    List<Event> events = new ArrayList<>();
        
    // Iterable<OnlineEvent> listOnlineEvents = onlineEventRepository.findAll();
    // Iterable<PhysicalEvent> listPhysicalEvents = physicalEventRepository.findAll();
    // events.addAll(listOnlineEvents);
    // events.addAll(listOnlineEvents);
        
    return events;
    }
}