package entities.catalogo;

import entities.popularidades.Normal;
import entities.popularidades.Popularidad;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Cancion {
  private String nombre;
  private Integer cantLikes;
  private Integer cantDislikes;
  private LocalDateTime fechaUltimaRepro;
  private Album album;
  private Integer cantReproduccionesEnPopularidad;
  private Popularidad popularidad;


  public Cancion(String nombre, Album album) {
    this.album = album;
    this.nombre = nombre;
    this.cantReproduccionesEnPopularidad = 0;
    this.popularidad = new Normal();
  }

  public void recibirLikes() {
    cantLikes++;
  }

  public void recibirDislikes() {
    cantDislikes++;
  }

  public String serEscuchada() {
    return this.popularidad.detallePara(this);
  }
}
