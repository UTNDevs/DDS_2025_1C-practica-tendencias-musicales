package entities.popularidades;

import entities.catalogo.Cancion;
import helpers.Icono;

public class EnTendencia extends Popularidad {
  private Integer cantReproduccionesEnPopularidadActual = 0;

  public EnTendencia() {
  }

  @Override
  public void reproducir(Cancion cancion){
  }

  @Override
  protected String leyendaPara(Cancion cancion) {
    return cancion.getNombre() + " - " + cancion.getAlbum().getArtista().getNombre() + " ( " + cancion.getAlbum().getNombre() + " - " + cancion.getAlbum().getAnio() + " ) ";
  }

  @Override
  protected String icono() {
    return Icono.FIRE.texto();
  }

}
