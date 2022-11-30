package pt.iade.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.models.Group; 
 
public interface GroupsRepository extends CrudRepository<Group,Integer> {

    @Query(value= "Select * from grupos where gru_name is :name ", nativeQuery= true)
    Optional<Group> findGroupByName(@Param ("name" )String name);
    
 } 