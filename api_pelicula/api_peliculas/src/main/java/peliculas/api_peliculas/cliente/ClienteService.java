package peliculas.api_peliculas.cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class ClienteService {
    @Autowired ClienteRepository entityRepository;

    public Cliente save(Cliente entity){
        return entityRepository.save(entity);
    }

    public Cliente findById( Long id){
        return entityRepository.findById(id).orElse(new Cliente());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Cliente> findAll(){
        return entityRepository.findAll();
    }
}
