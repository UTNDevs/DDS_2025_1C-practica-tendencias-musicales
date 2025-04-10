package entities.popularidades;

import entities.catalogo.Cancion;
import helpers.Icono;

public class Normal extends Popularidad {
  private Integer cantReproduccionesEnPopularidadActual = 0;
  private static Integer cantReproduccionesParaEstaPopularidad = 1000;

  @Override
  public void reproducir(Cancion cancion){
    if (cantReproduccionesEnPopularidadActual > 10000) {
      this.cantReproduccionesEnPopularidadActual = 0;
      cancion.setPopularidad(new EnAuge());
    }
  }

  @Override
  protected String icono() {
    return Icono.MUSICAL_NOTE.texto();
  }

  @Override
  protected String leyendaPara(Cancion cancion) {
    return cancion.getAlbum().getArtista().getNombre() + " - " + cancion.getAlbum().getNombre() + " - " + cancion.getNombre();
  }

}
