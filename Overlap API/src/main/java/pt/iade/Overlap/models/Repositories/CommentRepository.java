package pt.iade.Overlap.models.Repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.Overlap.models.Comment;

public interface CommentRepository extends CrudRepository<Comment,Integer> {
    
}
