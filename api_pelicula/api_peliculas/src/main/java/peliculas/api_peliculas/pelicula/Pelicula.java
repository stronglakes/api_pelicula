package peliculas.api_peliculas.pelicula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import  peliculas.api_peliculas.categoria.Categoria;

@Data
@Entity


public class Pelicula {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

     @ManyToOne
    private Categoria categoria;
    
}