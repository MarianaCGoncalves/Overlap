package pt.iade.Overlap.models.Repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.User;
import pt.iade.Overlap.models.UserTag;
import pt.iade.Overlap.models.views.GroupView;
import pt.iade.Overlap.models.views.UserView; 
 
public interface UsersRepository extends CrudRepository<User,Integer> {
    @Query(value = "Select use_id as id, use_name as name, use_acc_create as accountcreated, use_pass as password, use_mail as mail from users", nativeQuery = true)
    Iterable<UserView> findAllUsers();

    @Query(value = "Select * from users where use_id= :id", nativeQuery= true)
    Optional<User> findUserById(@Param("id") int id);

    @Query(value = "Select * from users where use_name like :name", nativeQuery = true)
    ArrayList<User> findUserByName(@Param("name") String name); 

    @Query(value = "Select * from users where use_mail like :mail", nativeQuery = true)
    ArrayList<User> findUserByEmail(@Param("mail") String mail);

    // @Query(value = "Select * from users where use_id = id and use_id= tu_use_id and tag_id = tu_tag_id and tag_name like : tag_n ", nativeQuery = true)
    // Optional<UserTag> findUserTagSelected(@Param("id") int id, @Param("tag_n") String tag_n);

    @Query(value= "select * from users where use_mail like :mail and use_pass like :pass", nativeQuery = true)
    Optional<User> LoginUser(@Param("mail") String mail, @Param("pass") String pass);
    
    String SearchUserInGroups = "select gru_id as GroupId, gru_use_id as GroupUserId, "
    +"gru_name as GroupName, gru_desc as GroupDescription, gru_create_age as GroupBirthDay, "
    +"gru_last_post_age as GroupLastPost, gru_at as GroupActivity "
    +"from grupos, usergroup, users, grouptag, tags " 
    +"where use_id = ug_use_id and gru_id = ug_gru_id and tg_gru_id = gru_id and tg_tag_id = tag_id";

    @Query(value = SearchUserInGroups + " and use_id = :id", nativeQuery = true)
    ArrayList<GroupView> findGroupWhereUserIs(@Param("id") int id);

    @Query(value = SearchUserInGroups + " and use_id= :id and gru_name like %:name%", nativeQuery = true)
    ArrayList<GroupView> findGroupWhereUserIsByName(@Param("id") int id, @Param("name") String name);

    @Query(value = SearchUserInGroups + " and use_id = :id and tag_name like %:name%", nativeQuery = true)
    ArrayList<GroupView> findGroupWhereUserIsByTagName(@Param("id") int id, @Param("name") String name);
    
}
