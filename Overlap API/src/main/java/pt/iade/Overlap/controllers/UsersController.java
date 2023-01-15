package pt.iade.Overlap.controllers;


import java.util.ArrayList;
import java.util.Optional;

import javax.validation.constraints.Null;

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
import pt.iade.Overlap.models.Tag;
import pt.iade.Overlap.models.User;
import pt.iade.Overlap.models.UserGroup;
import pt.iade.Overlap.models.UserTag;
import pt.iade.Overlap.models.Repositories.TagsRepository;
import pt.iade.Overlap.models.Repositories.UserGroupRepository;
import pt.iade.Overlap.models.Repositories.UserTagRepository;
import pt.iade.Overlap.models.Repositories.UsersRepository;
import pt.iade.Overlap.models.exceptions.SameMailException;
import pt.iade.Overlap.models.exceptions.SameNameException;
import pt.iade.Overlap.models.views.GroupView;

@RestController 
@RequestMapping(path = "api/users") 
public class UsersController { 
    private Logger logger = LoggerFactory.getLogger(UsersController.class); 
    @Autowired 
    private UsersRepository usersRepository; 
    @Autowired 
    private UserGroupRepository usergroupRepository;
    @Autowired 
    private UserTagRepository usertagsRepository; 
    
    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<User> getUsers() { 
        logger.info("Sending all users"); 
        return usersRepository.findAll(); 
    } 

    @GetMapping(path = "/id/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable int id) throws NotFoundException {
        logger.info("User with id "+id);
        Optional<User> _user = usersRepository.findById(id);
        if (!_user.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+id, "User", "id");
        else return _user.get();
    }

     @GetMapping(path = "/name/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
     public ArrayList<User> getUserbyName(@PathVariable String name) throws NotFoundException{
         logger.info("User with name "+name);
        ArrayList<User> _userList = usersRepository.findUserByName(name);
        
        if(_userList.size()>0) return _userList;
        else throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+name, "User", "name");
    }//retorna um user com um certo nome



    @GetMapping(path = "/name/verification/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean IsThereSameName(@PathVariable String name){
        logger.info("User with name "+name);
        ArrayList<User> _userList = usersRepository.findUserByName(name);
        if(_userList.size()>0) {return true;} 
        else {return false;}
        }  //verifica se ha um user com aquele nome
    
    @GetMapping(path = "/mail/verification/{mail}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean IsThereSameEmail(@PathVariable String mail){
        logger.info("User with name "+mail);
        ArrayList<User> _userList = usersRepository.findUserByEmail(mail);
        if(_userList.size()>0) {return true;} 
        else {return false;}
    }//verifica se ha um user com aquele email
       
    @PostMapping(path = "/registo/name/{name}/password/{password}/mail/{mail}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer registoUser(@PathVariable String name , @PathVariable String password, @PathVariable String mail) throws SameMailException, SameNameException {
        boolean same_name= IsThereSameName(name);
        boolean same_mail= IsThereSameEmail(mail);
        if(same_name){
            throw new pt.iade.Overlap.models.exceptions.SameNameException("resuser", "resuser_name");
        }
        else if(same_mail){
            throw new pt.iade.Overlap.models.exceptions.SameMailException("resuser", "resuser_mail");
        }
        User _user= new User(name, password, mail);
        usersRepository.save(_user);
        int _id = _user.getId();
        return _id;
    }//registo so aceita se o nome e o email forem diferentes provavelmente pode ser feito com uma unica querry enves de duas funçoes intermedias


    //erro.
    @GetMapping(path = "/tag/get/by/name/{user_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Tag> getUserTags(@PathVariable int user_id) throws NotFoundException {
        logger.info("User with id"+user_id);
        ArrayList<Tag> _tag = usertagsRepository.findUserTags(user_id);
        if (_tag.size()>0) {return _tag;} 
        else{
            throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+user_id, "Tag", "name");
        }
    }//retorna as tags de um user

    @PutMapping(path = "/update/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User updateUser(@PathVariable int id, @RequestBody User user){
        User updatedUser = usersRepository.findById(id).get();
        updatedUser.setUserName(user.getUserName());
        updatedUser.setPassword(user.getPassword());
        usersRepository.save(updatedUser);
        return user;
    }



    @DeleteMapping(path = "/delete/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User deleteUser(@PathVariable int id) throws NotFoundException{
        logger.info("Delete user with id "+id);
        Optional<User> deletedUser = usersRepository.findById(id);
        if(!deletedUser.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+id, "User", "id");
        else { User _user = usersRepository.findById(id).get();

            usersRepository.delete(_user);
        return deletedUser.get();}

        
    }


    @GetMapping(path = "/login/mail/{mail}/password/{password}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer loginUser(@PathVariable String mail, String password) throws NotFoundException {
        logger.info("Loging in");
        Optional<User> _user = usersRepository.LoginUser(mail, password);
        if (!_user.isPresent()) throw new NotFoundException();
        else return _user.get().getId();
    }

    @PostMapping(path = "/id/{use_id}/group/add/{gru_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer CreateUserGroup(@PathVariable int use_id, @PathVariable int gru_id) throws NotFoundException {
        logger.info("Adding user group "+use_id);
        Optional<User> user = usersRepository.findById(use_id);
         if (!user.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+use_id, "User", "id");
        else {
             UserGroup _usergroup =usergroupRepository.save(new UserGroup(gru_id, use_id));
             Integer _id= _usergroup.getUserGroupId();
             return _id;
        }
     }//(create user group)

     @PostMapping(path = "/id/{use_id}/tag/add/{tag_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer CreateUserTag(@PathVariable int use_id, @PathVariable int tag_id) throws NotFoundException {
        logger.info("Adding user tag "+use_id);
        Optional<User> user = usersRepository.findById(use_id);
        if (!user.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+use_id, "User", "id");
        else {
            UserTag _usertag= usertagsRepository.save(new UserTag(tag_id, use_id));
            Integer _id= _usertag.getTagUserId();
            return _id;
        }
    }
    //criaçao de uma user tag (pode ser feita no android)

    @DeleteMapping(path = "/delete/usertag/{tu_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer deleteUserTag(@PathVariable int tu_id) throws NotFoundException{
        logger.info("Delete usertag with id "+tu_id);
        Optional<UserTag> deleteTag = usertagsRepository.findById(tu_id);
        
        if(!deleteTag.isPresent()){ throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+tu_id, "Usertag", "id");}
        else{
            UserTag _usertag = usertagsRepository.findById(tu_id).get();
            usertagsRepository.delete(_usertag);
            Integer _id= 100;
            return _id;
        }
        // delete de uma user tag
    }

    @GetMapping(path = "/id/{use_id}/tag/verification/{tag_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer IsTagSelected(@PathVariable int use_id, @PathVariable int tag_id) throws NotFoundException{
        
        logger.info("User with name "+tag_id);
        ArrayList<UserTag> _user = usertagsRepository.findUserTag(use_id, tag_id);
        
        if(_user.size()>0) {
                UserTag _usertag = _user.get(0);
                Integer _tu_id = _usertag.getTagUserId();
                
                return _tu_id;} 
        else {
            Integer _id= 0;
            return _id; }
        
            }    //prob nao vai ser usada mas se posivel queria que funcionasse verifica se uma tag foi
    
            // selecionada pelo user ou nao em ves de string pode ser so o id dela tanto faz
            @GetMapping(path = "/id/{use_id}/group/name/{gru_name}", produces = MediaType.APPLICATION_JSON_VALUE)
            public ArrayList<GroupView> searchUserInGroup(@PathVariable int use_id, @PathVariable String gru_name) throws NotFoundException{
               logger.info("Searching groups by name "+gru_name+" With user "+use_id);
               ArrayList<GroupView> _group = usersRepository.findGroupWhereUserIsByName(use_id, gru_name);
               if(_group.size()>0){return _group;}
               else{
                   throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+use_id, "User", "id");
               }
           }
       
           @GetMapping(path = "/id/{use_id}/tag/name/{tag_name}", produces = MediaType.APPLICATION_JSON_VALUE)
           public ArrayList<GroupView> searchUserInGroupByTagName(@PathVariable int use_id, @PathVariable String tag_name) throws NotFoundException{
               logger.info("Searching groups by tag name "+tag_name+" with user id "+use_id);
               ArrayList<GroupView> _group = usersRepository.findGroupWhereUserIsByTagName(use_id, tag_name);
               if(_group.size()>0){return _group;}
               else{
                   throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+use_id, "User", "id");
               }
           }  




}
