package pt.iade.models.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import pt.iade.models.OnlineEvent; 
 
public interface OnlineEventRepository extends CrudRepository<OnlineEvent,Integer> {
        @Query(value = "Select eve_on_id as id, eve_on_dt as date, eve_on_ts as timestamp from eveonline", nativeQuery = true)
        Optional<OnlineEvent> getOnlineEvents();
     } 
