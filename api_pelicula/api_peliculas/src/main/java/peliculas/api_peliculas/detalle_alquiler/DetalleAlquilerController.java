package peliculas.api_peliculas.detalle_alquiler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/detalleAlquiler")
@CrossOrigin({"*"})
public class DetalleAlquilerController {
    @Autowired DetalleAlquilerService detalleAlquilerService;

    @GetMapping("/")
    public List<DetalleAlquiler> findAll(){
        return detalleAlquilerService.findAll();
    }

    @GetMapping("/{id}/")
    public DetalleAlquiler findById(@PathVariable Long id){
        return detalleAlquilerService.findById(id);
    }

    @PostMapping("/")
    public DetalleAlquiler save(@RequestBody DetalleAlquiler entity){
        return detalleAlquilerService.save(entity);
    }

    @PutMapping("/{id}/")
    public DetalleAlquiler update(@RequestBody DetalleAlquiler entity){
        return detalleAlquilerService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        detalleAlquilerService.deleteById(id);
    }
}

