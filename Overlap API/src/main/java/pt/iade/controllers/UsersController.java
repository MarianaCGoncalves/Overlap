package pt.iade.controllers;


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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.models.User;
import pt.iade.models.Repositories.UsersRepository;

@RestController 
@RequestMapping(path = "/api/users") 
public class UsersController { 
    private Logger logger = LoggerFactory.getLogger(UsersController.class); 
    @Autowired 
    private UsersRepository usersRepository; 
    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<User> getUsers() { 
        logger.info("Sending all users"); 
        return usersRepository.findAll(); 
    } 

    @GetMapping(path = "/{use_name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserbyName(@RequestParam ("use_name") String use_name) throws NotFoundException {
        logger.info("User with name "+use_name);
        Optional<User> _user = usersRepository.findUserByName(use_name);
        if (!_user.isPresent()) throw new NotFoundException();
        else return _user.get();
    }

    @GetMapping(path = "/{use_mail}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserbyEmail(@RequestParam ("use_mail") String use_mail) throws NotFoundException {
        logger.info("User with name "+use_mail);
        Optional<User> _user = usersRepository.findUserByName(use_mail);
        if (!_user.isPresent()) throw new NotFoundException();
        else return _user.get();
    }

    @GetMapping(path = "/{use_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable int use_id) throws NotFoundException {
        logger.info("User with id"+use_id);
        Optional<User> _user = usersRepository.findById(use_id);
        if (!_user.isPresent()) throw new NotFoundException();
        else return _user.get();
    }

    @PostMapping(path = "/registo", produces = MediaType.APPLICATION_JSON_VALUE)
    public String registoUser(@RequestBody User user) {
        usersRepository.save(user);
        return "User registed";
    }

    @PutMapping(path = "/update/{use_id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateUser(@PathVariable int use_id, @RequestBody User user){
        User updatedUser = usersRepository.findById(use_id).get();
        updatedUser.setUserName(user.getUserName());
        updatedUser.setPassword(user.getPassword());
        return "User updated";
    }

    @DeleteMapping(path = "/delete/{use_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User deleteUser(@PathVariable int use_id){
        Optional<User> deletedUser = usersRepository.findById(use_id);
        if  (!deletedUser.isPresent()) throw new pt.iade.models.exceptions.NotFoundException(""+use_id, "User", "id");
        else{
             usersRepository.RemoveUserById(use_id);
        }
        return deleteUser(use_id);
    }
}
    
    //TODO: mudar de equipa putmapping path = "/changeTag". PUTMAPPING.