package generation.mx.repositories;

import generation.mx.models.PostModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostModel, Long> {

}