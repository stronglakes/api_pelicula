package peliculas.api_peliculas.cliente;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    public List<Cliente> findAll();
}

