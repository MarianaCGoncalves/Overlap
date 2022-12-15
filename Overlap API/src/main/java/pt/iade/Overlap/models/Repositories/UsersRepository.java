package pt.iade.Overlap.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.User;
import pt.iade.Overlap.models.views.UserView; 
 
public interface UsersRepository extends CrudRepository<User,Integer> {
    @Query(value = "Select * from users", nativeQuery = true)
    Iterable<UserView> findAllUsers();

    @Query(value = "Select * from users where use_id= :id", nativeQuery= true)
    Optional<User> findUserById(@Param("id") int id);

    @Query(value = "Select * from users where use_name like :name", nativeQuery = true)
    Optional<User> findUserByName(@Param("name") String name); 

    @Query(value = "Select * from users where use_mail like :mail", nativeQuery = true)
    Iterable<User> findUserByEmail(@Param("mail") String mail);

    @Query(value= "Select * from users where use_email like :mail and use_pass like :pass", nativeQuery = true)
    Optional<User> LoginUser(@Param("mail") String mail, @Param("pass") String pass);

    
}
