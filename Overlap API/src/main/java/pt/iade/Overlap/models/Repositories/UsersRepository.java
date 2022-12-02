package pt.iade.Overlap.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.User;
import pt.iade.Overlap.models.views.UserView; 
 
public interface UsersRepository extends CrudRepository<User,Integer> {
    @Query(value = "Select use_id as id, use_name as name, use_acc_create as accountcreated, use_pass as password, use_mail as mail from users", nativeQuery = true)
    Iterable<UserView> findAllUsers();

    @Query(value = "Select use_name as name from users where use_name like :name", nativeQuery = true)
    Optional<User> findUserByName(@Param("name") String name); 

    @Query(value = "Select use_mail as mail from users where use_mail like :mail", nativeQuery = true)
    Optional<User> findUserByEmail(@Param("mail") String mail);

    @Query(value = "delete from users where use_id =:id", nativeQuery = true)
    Optional<User> RemoveUserById(@Param("id") Integer id);
    
}
