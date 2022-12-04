package pt.iade.Overlap.controllers;


import java.time.LocalDateTime;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Overlap.models.Group;
import pt.iade.Overlap.models.Message;
import pt.iade.Overlap.models.Repositories.GroupsRepository;
import pt.iade.Overlap.models.Repositories.MessageRepository;

@RestController 
@RequestMapping(path = "/api/groups") 
public class GroupsController { 
    private Logger logger = LoggerFactory.getLogger(GroupsController.class); 
    @Autowired 
    private GroupsRepository groupsRepository; 
    
    @Autowired 
    private MessageRepository messageRepository; 

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<Group> getGroups() { 
        logger.info("All Groups"); 
        return groupsRepository.findAll(); 
    } 

    @GetMapping(path = "/{gru_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Group getGroupById(@PathVariable int gru_id) throws NotFoundException {
        logger.info("User with id"+gru_id);
        Optional<Group> _group = groupsRepository.findById(gru_id);
        if (!_group.isPresent()) throw new NotFoundException();
        else return _group.get();
    }

    @GetMapping(path = "/{gru_name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Group getGroupByName(@PathVariable String gru_name) throws NotFoundException {
        logger.info("User with id"+gru_name);
        Optional<Group> _group = groupsRepository.findGroupByName(gru_name);
        if (!_group.isPresent()) throw new NotFoundException();
        else return _group.get();
    }

    @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public String createGroup(@RequestBody Group group) {
        groupsRepository.save(group);
        return "Group created";
    }

    @PutMapping(path = "/update/{gru_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateUser(@PathVariable int use_id, @RequestBody Group group){
        Group updatedGroup = groupsRepository.findById(use_id).get();
        updatedGroup.setCreatorId(group.getCreatorId()); //moderador
        updatedGroup.setGroupName(group.getGroupName());
        updatedGroup.setGroupDescription(group.getGroupDescription());
        return "Group updated";
    }

    @PutMapping(path = "/update/activity", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateActivity(@PathVariable boolean gru_at, int gru_id) {
        Optional<Message> LastPost = messageRepository.getLastMessage(gru_id);

        if(LastPost.isEmpty()){
            return false;
        }
        Message message = LastPost.get();
        boolean ONtime = LocalDateTime.now().minusMonths(3).isAfter(message.getMessageDate());
        gru_at = !ONtime;

        return gru_at; // gru_at = true, grupo está ativo. se gru_at = false entao o grupo esta inativo.
    }

    @DeleteMapping(path = "/delete/{gru_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteGroup(@PathVariable int gru_id){
        Group deleteUser = groupsRepository.findById(gru_id).get();
        groupsRepository.delete(deleteUser);
        return "Delete user with the id "+gru_id;
        }
}