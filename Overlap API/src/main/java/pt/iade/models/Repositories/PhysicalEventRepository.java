package pt.iade.models.Repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import pt.iade.models.PhysicalEvent; 
 
public interface PhysicalEventRepository extends CrudRepository<PhysicalEvent,Integer> {

    @Query(value = "Select * from evefisico", nativeQuery = true)
    Optional<PhysicalEvent> getPhysicalEvents();
 } 
