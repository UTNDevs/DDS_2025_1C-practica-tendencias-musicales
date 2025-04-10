package entities.popularidades;

import entities.catalogo.Cancion;
import helpers.Icono;

public class EnAuge extends Popularidad{
  private Integer cantReproduccionesEnPopularidadActual = 0;
  private static Integer cantReproduccionesEnPopularidad = 50000;

  @Override
  public void reproducir(Cancion cancion) {
    if (cantReproduccionesEnPopularidadActual > cantReproduccionesEnPopularidad && cancion.getCantLikes() > 20000) {
      this.cantReproduccionesEnPopularidadActual = 0;
      cancion.setPopularidad(new EnTendencia());
    }
  }

  @Override
  protected String leyendaPara(Cancion cancion) {
    return cancion.getAlbum().getArtista().getNombre() + " - " + cancion.getNombre()  + " ( " + cancion.getAlbum().getNombre() + " - " + cancion.getAlbum().getAnio() + " ) ";
  }

  @Override
  protected String icono() {
    return Icono.ROCKET.texto();
  }
}
