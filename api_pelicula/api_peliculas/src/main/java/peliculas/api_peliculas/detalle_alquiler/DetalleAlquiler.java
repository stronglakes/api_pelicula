package peliculas.api_peliculas.detalle_alquiler;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import  peliculas.api_peliculas.pelicula.Pelicula;
import  peliculas.api_peliculas.alquiler.Alquiler;

@Data
@Entity


public class DetalleAlquiler {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @ManyToOne
    private Pelicula pelicula;
     @ManyToOne
    private Alquiler alquiler;
    
}