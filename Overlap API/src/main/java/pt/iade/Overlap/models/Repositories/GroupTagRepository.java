package pt.iade.Overlap.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.GroupTag;
import pt.iade.Overlap.models.Tag;

public interface GroupTagRepository extends CrudRepository<GroupTag, Integer>{

    @Query(value = "Select tag_id as id, tag_name as name from grupos, tags, usertag where tag_id = tg_tag_id and gru_id = tg_gru_id and gru_id = gid and tag_id=tid", nativeQuery = true)
    Optional<Tag> findGroupTag(@Param("gid") int gruid, @Param("tid") int tagid); 
    
}
