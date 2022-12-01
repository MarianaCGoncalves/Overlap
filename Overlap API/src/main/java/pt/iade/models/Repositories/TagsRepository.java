package pt.iade.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.models.Tag;
 
public interface TagsRepository extends CrudRepository<Tag,Integer> {
    @Query(value = "Select tag_id as id, tag_name as name from tags where tag_name like :name", nativeQuery = true)
    Optional<Tag> findTagByName(@Param("name")String name);
 } 
