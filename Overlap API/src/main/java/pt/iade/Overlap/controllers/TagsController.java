package pt.iade.Overlap.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Overlap.models.Tag;
import pt.iade.Overlap.models.Repositories.TagsRepository;

@RestController 
@RequestMapping(path = "/api/tags") 
public class TagsController { 
    private Logger logger = LoggerFactory.getLogger(TagsController.class); 
    @Autowired 
    private TagsRepository tagsRepository; 
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<Tag> getTags() { 
        logger.info("All tags"); 
        return tagsRepository.findAll(); 
    } 

    @GetMapping (path = "/{tag_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Tag getTag(@PathVariable int tag_id) throws NotFoundException {
        logger.info("Tag with id"+tag_id);
        Optional<Tag> _tag = tagsRepository.findById(tag_id);
        if (!_tag.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException("" +tag_id , "Tag", "id");
        else return _tag.get();
    }

    @GetMapping (path = "/{tag_name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Tag getTagByName(@PathVariable String tag_name) throws NotFoundException {
        logger.info("Tag with name "+tag_name);
        Optional<Tag> _tag = tagsRepository.findTagByName(tag_name);
        if (!_tag.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+tag_name, "Tag", "name");
        else return _tag.get();
    }


}