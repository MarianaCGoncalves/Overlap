package pt.iade.Overlap.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.Message; 
 
public interface MessageRepository extends CrudRepository<Message,Integer> {

    @Query(value = "Select * from mensagem left join usergroup ON ug_id = mes_ug_id where ug_gru_id = :gid ORDER BY mes_ts DESC LIMIT 1", nativeQuery = true)
    Optional<Message> getLastMessage(@Param("gid") int gid);

    @Query(value = "Select * from mensagem left join usergroup ON ug_id = mes_ug_id where ug_gru_id = :gid", nativeQuery = true)
    Iterable<Message> getAllMessages(@Param("gid") int gid);
 } 
