package pt.iade.Overlap.models.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.UserTag;

public interface UserTagRepository extends CrudRepository<UserTag,Integer>{
    @Query(value= "Select * from usertag where tu_use_id = :id", nativeQuery = true)
    Iterable<UserTag> FindUserTag(@Param("id") Integer id);
    
}
