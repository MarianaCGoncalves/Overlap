package pt.iade.Overlap.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.Message; 
 
public interface MessageRepository extends CrudRepository<Message,Integer> {

    @Query(value = "Select * from mensagem left join usergroup ON ug_id = mes_ug_id where ug_gru_id = :gid ORDER BY mes_date DESC LIMIT 1", nativeQuery = true)
    Optional<Message> getLastMessage(@Param("gid") int gid);

    // @Query(value = "select * from mensagem, usergroup, grupos where mes_ug_id=ug_id and ug_gru_id = :id", nativeQuery = true)
    // Iterable<Message> getAllMessagesByGroup(@Param("id") Integer id);
 } 
