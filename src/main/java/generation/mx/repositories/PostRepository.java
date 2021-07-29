package generation.mx.repositories;

import generation.mx.models.PostModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends CrudRepository<PostModel, Long> {

    public abstract ArrayList<PostModel> findByTitleContaining(String title);

    /* findByTitleContainingOrderByIdDesc: busca por el titulo y los ordena
       por id de mayor a menor
     */
    public abstract ArrayList<PostModel> findByTitleContainingOrderByIdDesc(String title);

}