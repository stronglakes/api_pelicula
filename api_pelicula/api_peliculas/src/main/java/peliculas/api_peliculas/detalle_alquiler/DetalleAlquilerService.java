package peliculas.api_peliculas.detalle_alquiler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class DetalleAlquilerService {
    @Autowired DetalleAlquilerRepository entityRepository;

    public DetalleAlquiler save(DetalleAlquiler entity){
        return entityRepository.save(entity);
    }

    public DetalleAlquiler findById( Long id){
        return entityRepository.findById(id).orElse(new DetalleAlquiler());
    }

    public void deleteById(Long id){
        entityRepository.deleteById(id);
    }

    public List<DetalleAlquiler> findAll(){
        return entityRepository.findAll();
    }
}
