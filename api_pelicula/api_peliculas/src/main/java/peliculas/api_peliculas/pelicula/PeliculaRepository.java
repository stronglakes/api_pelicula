package peliculas.api_peliculas.pelicula;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {

    public List<Pelicula> findAll();
}
