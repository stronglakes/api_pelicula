package peliculas.api_peliculas.pelicula;

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
@RequestMapping("api/pelicula")
@CrossOrigin({"*"})
public class PeliculaController {
    @Autowired PeliculaService peliculaService;

    @GetMapping("/")
    public List<Pelicula> findAll(){
        return peliculaService.findAll();
    }

    @GetMapping("/{id}/")
    public Pelicula findById(@PathVariable Long id){
        return peliculaService.findById(id);
    }

    @PostMapping("/")
    public Pelicula save(@RequestBody Pelicula entity){
        return peliculaService.save(entity);
    }

    @PutMapping("/{id}/")
    public Pelicula update(@RequestBody Pelicula entity){
        return peliculaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        peliculaService.deleteById(id);
    }
}
