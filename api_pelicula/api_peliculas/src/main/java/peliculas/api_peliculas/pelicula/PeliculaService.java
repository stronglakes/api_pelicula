package peliculas.api_peliculas.pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class PeliculaService {
    @Autowired PeliculaRepository entityRepository;

    public Pelicula save(Pelicula entity){
        return entityRepository.save(entity);
    }

    public Pelicula findById( Long id){
        return entityRepository.findById(id).orElse(new Pelicula());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Pelicula> findAll(){
        return entityRepository.findAll();
    }
}