package pt.iade.Overlap.controllers;


import java.time.LocalDateTime;
import java.util.ArrayList;
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
import pt.iade.Overlap.models.GroupTag;
import pt.iade.Overlap.models.Message;
import pt.iade.Overlap.models.Tag;
import pt.iade.Overlap.models.UserGroup;
import pt.iade.Overlap.models.Repositories.GroupTagRepository;
import pt.iade.Overlap.models.Repositories.GroupsRepository;
import pt.iade.Overlap.models.Repositories.MessageRepository;
import pt.iade.Overlap.models.Repositories.UserGroupRepository;
import pt.iade.Overlap.models.Repositories.UsersRepository;
import pt.iade.Overlap.models.exceptions.AlreadyExistsException;

@RestController 
@RequestMapping(path = "/api/groups") 
public class GroupsController { 
    private Logger logger = LoggerFactory.getLogger(GroupsController.class); 
    @Autowired 
    private GroupsRepository groupsRepository; 
    
    @Autowired 
    private MessageRepository messageRepository; 

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private GroupTagRepository groupTagRepository;

    @Autowired
    private UserGroupRepository usergroupRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<Group> getGroups() { 
        logger.info("All Groups"); 
        return groupsRepository.findAll(); 
    } 

    @GetMapping(path = "/{gru_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Group getGroupById(@PathVariable int gru_id) throws NotFoundException {
        logger.info("User with id"+gru_id);
        Optional<Group> _group = groupsRepository.findById(gru_id);
        if (!_group.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+gru_id, "Group", "id");
        else return _group.get();
    }
    //grupo com certo id

    @GetMapping(path = "/by/name/{gru_name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Group> getGroupByName(@PathVariable String gru_name) throws NotFoundException {
        logger.info("User with id"+gru_name);
        ArrayList<Group> _group = groupsRepository.findGroupByName(gru_name);
        if (_group.size()>0) {return _group;} 
        else{
            throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+gru_name, "Group", "name");
        }
    }

    //lista de grupos que tenham uma string no nome

    @GetMapping(path = "/by/tag/{tag_name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Group> getGroupByTag(@PathVariable String tag_name) throws NotFoundException {
        logger.info("User with id"+tag_name);
        
        ArrayList<Group> _group = groupsRepository.findGroupByTag(tag_name);
        if(_group.size()>0) {return _group;} 
        else{
            throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+tag_name, "Group", "name");
            
        }
    }
    //lista de grupos com uma certa tag

    @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public String createGroup(@RequestBody Group group) {
        groupsRepository.save(group);
        return "Group created";
    }

    @DeleteMapping(path = "/delete/{gru_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteGroup(@PathVariable int gru_id){
        Group deleteUser = groupsRepository.findById(gru_id).get();
        groupsRepository.delete(deleteUser);
        return "Delete group with the id "+gru_id;
        }

    @PutMapping(path = "/update/{gru_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateUser(@PathVariable int gru_id, @RequestBody Group group){
        Group updatedGroup = groupsRepository.findById(gru_id).get();
        updatedGroup.setCreatorId(group.getCreatorId()); //moderador
        updatedGroup.setGroupName(group.getGroupName());
        updatedGroup.setGroupDescription(group.getGroupDescription());
        groupsRepository.save(updatedGroup);
        return "Group updated";
    }

    @PutMapping(path = "/update/activity/{gru_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateActivity(@PathVariable int gru_id) {
        Optional<Message> LastPost = messageRepository.getLastMessage(gru_id);
        if(LastPost.isEmpty()){
            return false;
        }
        Message message = LastPost.get();
        boolean ONtime = LocalDateTime.now().minusMonths(3).isAfter(message.getMessageDate());
        

        return !ONtime; 
    }

    

    //     @PostMapping(path = "/join/{gru_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // public String joinGroup(@RequestBody UserGroup userGroup, @PathVariable int gru_id) throws NotFoundException {
    //     logger.info("adding "+userGroup);
    //     int _id = userGroup.getUserId();
    //     int _id2 = userGroup.getGroupId();
    //     ArrayList<UserGroup> _usergroup = usergroupRepository.findSpecificUserGroups( _id, _id2);
    //     if(_usergroup.get(0)!=null) {throw new AlreadyExistsException();} 
    //     else {
    //         usergroupRepository.save(userGroup);
    //         return "Group created";
    //         }
        //} 

        // da join de um grupo usando o id do user e o id do grupo ambos 
        //sao tirados do android e juntados num user group


        @PostMapping(path = "id/{gru_id}/tag/add/{tag_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void CreateGroupTag(@PathVariable int gru_id, @PathVariable int tag_id) throws NotFoundException {
        logger.info("Adding user tag "+gru_id);
        Optional<Group> _group = groupsRepository.findById(gru_id);
        if (!_group.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+gru_id, "User", "id");
        else {
            groupTagRepository.save(new GroupTag(tag_id, gru_id));
        }
        
    }
    //cria uma tag para o grupo

    @DeleteMapping(path = "/delete/grouptag/{tg_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteGroupTag(@PathVariable int tg_id) throws NotFoundException{
        logger.info("Delete user with id "+tg_id);
        Optional<GroupTag> deleteGroupTag = groupTagRepository.findById(tg_id);

        if(!deleteGroupTag.isPresent()){ throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+tg_id, "GroupTag", "id");}
        else{
            GroupTag _grouptag = groupTagRepository.findById(tg_id).get();
            groupTagRepository.delete(_grouptag);
           
        }
         
        
        //da delete
    }

    
}