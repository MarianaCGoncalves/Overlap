package pt.iade.Overlap.models.Repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.Tag;
import pt.iade.Overlap.models.UserTag;


public interface UserTagRepository extends CrudRepository<UserTag,Integer>{
    @Query(value = "Select tag_id , tag_name as name from users, tags, usertag where tag_id = tu_tag_id and use_id = tu_use_id and use_id = :useid", nativeQuery = true)
    ArrayList<Tag> findUserTags(@Param("useid") int useid); 
    
    @Query(value = "Select tu_id, tu_tag_id, tu_use_id from users, tags, usertag where use_id = :idpar and tag_id = :tag_npar and tag_id = tu_tag_id and use_id = tu_use_id ", nativeQuery = true)
    ArrayList<UserTag> findUserTag(@Param("idpar") int useid, @Param("tag_npar") int tagid); 

    
    
}
