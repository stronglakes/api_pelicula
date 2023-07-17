package peliculas.api_peliculas.categoria;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class CategoriaService {
    @Autowired CategoriaRepository entityRepository;

    public Categoria save(Categoria entity){
        return entityRepository.save(entity);
    }

    public Categoria findById( Long id){
        return entityRepository.findById(id).orElse(new Categoria());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<Categoria> findAll(){
        return entityRepository.findAll();
    }
}
