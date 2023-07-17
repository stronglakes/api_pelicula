package peliculas.api_peliculas.alquiler;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AlquilerRepository extends CrudRepository<Alquiler, Long> {

    public List<Alquiler> findAll();
}
