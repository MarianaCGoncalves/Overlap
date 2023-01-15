package pt.iade.Overlap.models.Repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.Overlap.models.Event;

public interface EventRepository extends CrudRepository<Event, Integer>{
    
}
