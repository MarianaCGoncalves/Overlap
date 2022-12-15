package pt.iade.Overlap.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.OnlineEvent;
import pt.iade.Overlap.models.views.OnlineEventView;
 
public interface OnlineEventRepository extends CrudRepository<OnlineEvent,Integer> {
        @Query(value = "Select * from eveonline", nativeQuery = true)
        Optional<OnlineEvent> getOnlineEvents();

        @Query(value = "select * from eventos INNER JOIN eveonline ON eve_id = eve_on_eve_id", nativeQuery = true)
        Iterable<OnlineEventView> getAllInfoOnlineEvents();

        // @Query(value = "select * from eventos, eveonline, grupos, usergroup where eve_id = eve_on_eve_id and eve_ug_id = ug_id and ug_gru_id = :id", nativeQuery = true)
        // Iterable<OnlineEvent> getOnlineEventsByGroup(@Param ("id") Integer id);
     } 
