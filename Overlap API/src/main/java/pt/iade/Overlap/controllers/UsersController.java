package pt.iade.Overlap.controllers;


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

import pt.iade.Overlap.models.User;
import pt.iade.Overlap.models.Repositories.UsersRepository;

@RestController 
@RequestMapping(path = "api/users") 
public class UsersController { 
    private Logger logger = LoggerFactory.getLogger(UsersController.class); 
    @Autowired 
    private UsersRepository usersRepository; 
    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE) 
    public Iterable<User> getUsers() { 
        logger.info("Sending all users"); 
        return usersRepository.findAll(); 
    } 

    @GetMapping(path = "/name/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserbyName(@PathVariable String name) throws NotFoundException{
        logger.info("User with name "+name);
        Optional<User> _user = usersRepository.findUserByName(name);
        if(!_user.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+name, "User", "name");
        else return _user.get();
    }

    // @GetMapping(path = "/{mail}" , produces = MediaType.APPLICATION_JSON_VALUE)
    // public Iterable<User> getUserbyEmail(@RequestParam (value"mail") String mail) {
    //     logger.info("User with name "+mail);
    //     Iterable<User> _user = usersRepository.findUserByEmail(mail);
    //     if(_user==null) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+mail, "User", "mail");
    //     else return _user;
    // }

    @GetMapping(path = "/id/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable int id) throws NotFoundException {
        logger.info("User with id "+id);
        Optional<User> _user = usersRepository.findById(id);
        if (!_user.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+id, "User", "id");
        else return _user.get();
    }

    @PostMapping(path = "/registo", produces = MediaType.APPLICATION_JSON_VALUE)
    public User registoUser(@RequestBody User user) {
        usersRepository.save(user);
        return user;
    }

    @PutMapping(path = "/update/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public User updateUser(@PathVariable int id, @RequestBody User user){
        User updatedUser = usersRepository.findById(id).get();
        updatedUser.setUserName(user.getUserName());
        updatedUser.setPassword(user.getPassword());
        usersRepository.save(updatedUser);
        return user;
    }

    // @DeleteMapping(path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // public User deleteUser(@PathVariable int id) throws NotFoundException{
    //     logger.info("Delete user with id "+id);
    //     Optional<User> deletedUser = usersRepository.findById(id);
    //     if  (!deletedUser.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+id, "User", "id");
    //     else{
    //          usersRepository.delete(deleteUser(id));
    //     }
    //     return deletedUser;
    // }

    @DeleteMapping(path = "/delete/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User deleteUser(@PathVariable int id) throws NotFoundException{
        logger.info("Delete user with id "+id);
        Optional<User> deletedUser = usersRepository.findById(id);
        if(!deletedUser.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+id, "User", "id");
        else usersRepository.deleteById(id);
        return deletedUser.get();
        
        // User deletedUser = usersRepository.findById(id).get();
        // usersRepository.delete(deletedUser);
        // return deletedUser;
    }

    @PostMapping(path = "/login" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer loginUser(@RequestBody User user) throws NotFoundException {
        logger.info("Logging in");
        Optional<User> _user = usersRepository.LoginUser(user.getMail(), user.getPassword());
        if (!_user.isPresent()) throw new pt.iade.Overlap.models.exceptions.NotFoundException(""+user.getMail() + user.getPassword(), "User", "email and password");
        else return _user.get().getId();
    }
}
    