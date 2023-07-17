package peliculas.api_peliculas.alquiler;

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
@RequestMapping("api/alquiler")
@CrossOrigin({"*"})
public class AlquilerController {
    @Autowired AlquilerService alquilerService;

    @GetMapping("/")
    public List<Alquiler> findAll(){
        return alquilerService.findAll();
    }

    @GetMapping("/{id}/")
    public Alquiler findById(@PathVariable Long id){
        return alquilerService.findById(id);
    }

    @PostMapping("/")
    public Alquiler save(@RequestBody Alquiler entity){
        return alquilerService.save(entity);
    }

    @PutMapping("/{id}/")
    public Alquiler update(@RequestBody Alquiler entity){
        return alquilerService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        alquilerService.deleteById(id);
    }
}

