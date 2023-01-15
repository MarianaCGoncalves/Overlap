package pt.iade.Overlap.models.Repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.Group; 
 
public interface GroupsRepository extends CrudRepository<Group,Integer> {

    @Query(value= "Select * from grupos where gru_name like %:name% ", nativeQuery= true)
    ArrayList<Group> findGroupByName(@Param ("name" )String name);

    @Query(value= "select gru_id, gru_use_id, gru_name, gru_desc , gru_create_age, gru_last_post_age, gru_at from grupos, grouptag, tags where tg_gru_id = gru_id and tag_id= tg_tag_id and tag_name like %:name%", nativeQuery= true)
    ArrayList<Group> findGroupByTag(@Param ("name" )String name);
    
 } 