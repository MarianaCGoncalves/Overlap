package pt.iade.Overlap.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pt.iade.Overlap.models.Repositories.PhysicalEventRepository;
import pt.iade.Overlap.models.views.PhysicalEventEveView;

@RestController 
@RequestMapping(path = "/api/physicalevents") 
public class PhysicalEventsController { 
    private Logger logger = LoggerFactory.getLogger(PhysicalEventsController.class); 
    @Autowired 
    private PhysicalEventRepository physicaleventsRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<PhysicalEventEveView> getPhysicalEvents() { 
        logger.info("All physical events"); 
        return physicaleventsRepository.getPhysicalEvents(); 
    } 

    //TODO: apenas aparecer os eventos fisicos de um certo grupo. 
}
