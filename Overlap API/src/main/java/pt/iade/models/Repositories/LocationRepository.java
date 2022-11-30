package pt.iade.models.Repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.models.Location; 
 
public interface LocationRepository extends CrudRepository<Location,Integer> { } 