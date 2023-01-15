package pt.iade.Overlap.models.Repositories;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.UserGroup;

public interface UserGroupRepository extends CrudRepository<UserGroup, Integer>{
    
    @Query(value = "select * from usergroup where ug_gru_id = :id", nativeQuery = true)
    Iterable<UserGroup> FindUserGroup(@Param("id") int id);

    @Query(value = "select ug_id as id , ug_gru_id as gruid, ug_use_id as useid from grupos, users, usergroup where ug_gru_Id = gru_id and ug_use_id = use_id and use_id= :id", nativeQuery = true)
    ArrayList<UserGroup> findAUserGroups(@Param("id") int id);

    @Query(value = "select ug_id as id , ug_gru_id as gruid, ug_use_id as useid from grupos, users, usergroup where ug_gru_Id = gru_id and ug_use_id = use_id and use_id= :id and gru_id= :id2", nativeQuery = true)
    ArrayList<UserGroup> findSpecificUserGroups(@Param("id") int id, @Param("id2") int id2 );
        

    



}
