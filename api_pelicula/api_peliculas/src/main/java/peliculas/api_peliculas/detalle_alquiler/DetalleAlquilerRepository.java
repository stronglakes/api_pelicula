package peliculas.api_peliculas.detalle_alquiler;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DetalleAlquilerRepository extends CrudRepository<DetalleAlquiler, Long> {

    public List<DetalleAlquiler> findAll();
}

