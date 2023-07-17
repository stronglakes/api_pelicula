package peliculas.api_peliculas.categoria;

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
@RequestMapping("api/categoria")
@CrossOrigin({"*"})
public class CategoriaController {
    @Autowired CategoriaService categoriaService;

    @GetMapping("/")
    public List<Categoria> findAll(){
        return categoriaService.findAll();
    }

    @GetMapping("/{id}/")
    public Categoria findById(@PathVariable Long id){
        return categoriaService.findById(id);
    }

    @PostMapping("/")
    public Categoria save(@RequestBody Categoria entity){
        return categoriaService.save(entity);
    }

    @PutMapping("/{id}/")
    public Categoria update(@RequestBody Categoria entity){
        return categoriaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        categoriaService.deleteById(id);
    }
}

