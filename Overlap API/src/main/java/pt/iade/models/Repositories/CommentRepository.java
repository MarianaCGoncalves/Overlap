package pt.iade.models.Repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.models.Comment;

public interface CommentRepository extends CrudRepository<Comment,Integer> {
    
}
