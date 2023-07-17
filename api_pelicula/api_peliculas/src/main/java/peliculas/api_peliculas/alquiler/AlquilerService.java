package peliculas.api_peliculas.alquiler;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class AlquilerService {
    @Autowired AlquilerRepository entityRepository;

    public Alquiler save(Alquiler entity){
        return entityRepository.save(entity);
    }

    public Alquiler findById( Long id){
        return entityRepository.findById(id).orElse(new Alquiler());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Alquiler> findAll(){
        return entityRepository.findAll();
    }
}