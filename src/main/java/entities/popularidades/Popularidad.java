package entities.popularidades;

import entities.catalogo.Cancion;

public abstract class Popularidad {

  public String detallePara(Cancion cancion){
    return this.icono() + " - " + this.leyendaPara(cancion);
  }

  public abstract void reproducir(Cancion cancion);

  protected abstract String leyendaPara(Cancion cancion);

  protected abstract String icono();
}
