package peliculas.api_peliculas.cliente;

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
@RequestMapping("api/cliente")
@CrossOrigin({"*"})
public class ClienteController {
    @Autowired ClienteService clienteService;

    @GetMapping("/")
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}/")
    public Cliente findById(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @PostMapping("/")
    public Cliente save(@RequestBody Cliente entity){
        return clienteService.save(entity);
    }

    @PutMapping("/{id}/")
    public Cliente update(@RequestBody Cliente entity){
        return clienteService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        clienteService.deleteById(id);
    }
}

