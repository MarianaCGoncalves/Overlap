package pt.iade.Overlap.models.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.UserGroup;

public interface UserGroupRepository extends CrudRepository<UserGroup, Integer>{
    
    @Query(value = "select * from usergroup where ug_gru_id = :id", nativeQuery = true)
    Iterable<UserGroup> FindUserGroup(@Param("id") int id);
}
