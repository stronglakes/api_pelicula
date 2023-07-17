package peliculas.api_peliculas.categoria;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

    public List<Categoria> findAll();
}


