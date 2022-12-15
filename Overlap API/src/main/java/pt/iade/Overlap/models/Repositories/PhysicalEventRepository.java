package pt.iade.Overlap.models.Repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.Overlap.models.PhysicalEvent; 
 
public interface PhysicalEventRepository extends CrudRepository<PhysicalEvent,Integer> {

    @Query(value = "Select * from evefisico", nativeQuery = true)
    Optional<PhysicalEvent> getPhysicalEvents();

    // @Query(value = "Select * from eventos, evefisico where eve_id = eve_on_phy_id", nativeQuery = true)
    // Optional<PhysicalEvent> getAllInfoOnlineEvents();

    // @Query(value = "select * from eventos, eveonline, grupos, usergroup where eve_id = eve_on_eve_id and eve_ug_id = ug_id and ug_gru_id = :id", nativeQuery = true)
    // Iterable<PhysicalEvent> getPhysicalEventsByGroup(@Param("id") Integer id);
 } 
