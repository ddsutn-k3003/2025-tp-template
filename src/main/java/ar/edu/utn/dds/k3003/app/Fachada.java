package ar.edu.utn.dds.k3003.app;

import ar.edu.utn.dds.k3003.facades.FachadaFuente;
import ar.edu.utn.dds.k3003.facades.FachadaProcesadorPdI;
import ar.edu.utn.dds.k3003.facades.dtos.ColeccionDTO;
import ar.edu.utn.dds.k3003.facades.dtos.HechoDTO;
import ar.edu.utn.dds.k3003.facades.dtos.PdIDTO;
import java.util.List;
import java.util.NoSuchElementException;

public class Fachada implements FachadaFuente {

  @Override
  public ColeccionDTO agregar(ColeccionDTO coleccionDTO) {
    return null;
  }

  @Override
  public ColeccionDTO buscarColeccionXId(String coleccionId) throws NoSuchElementException {
    return null;
  }

  @Override
  public HechoDTO agregar(HechoDTO hechoDTO) {
    return null;
  }

  @Override
  public HechoDTO buscarHechoXId(String hechoId) throws NoSuchElementException {
    return null;
  }

  @Override
  public List<HechoDTO> buscarHechosXColeccion(String coleccionId) throws NoSuchElementException {
    return null;
  }

  @Override
  public void setProcesadorPdI(FachadaProcesadorPdI procesador) {

  }

  @Override
  public PdIDTO agregar(PdIDTO pdIDTO) throws IllegalStateException {
    return null;
  }
}
