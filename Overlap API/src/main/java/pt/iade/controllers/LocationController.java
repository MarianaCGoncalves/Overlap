package pt.iade.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.models.Location;
import pt.iade.models.Repositories.LocationRepository;

@RestController 
@RequestMapping(path = "/api/location") 
public class LocationController { 
    private Logger logger = LoggerFactory.getLogger(LocationController.class); 
    @Autowired 
    private LocationRepository locationRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<Location> getLocation() { 
        logger.info("All locations"); 
        return locationRepository.findAll(); 
    } 
}