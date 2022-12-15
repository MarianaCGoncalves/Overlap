package pt.iade.Overlap.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

// @GetMapping(path = "/physical", produces = MediaType.APPLICATION_JSON_VALUE)
//     public Iterable<Event> getPhysicalEvents(){
//     logger.info("All Physical events!"); 
//     return getPhysicalEvents();
    
    
    
    
    //List<Event> events = new ArrayList<>();




    // Iterable<OnlineEvent> listOnlineEvents = onlineEventRepository.findAll();
    // Iterable<PhysicalEvent> listPhysicalEvents = physicalEventRepository.findAll();
    // events.addAll(listOnlineEvents);
    // events.addAll(listOnlineEvents);
        
    
    }
