package entities.catalogo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Album {
  private String nombre;
  private Artista artista;
  private Integer anio;

}
