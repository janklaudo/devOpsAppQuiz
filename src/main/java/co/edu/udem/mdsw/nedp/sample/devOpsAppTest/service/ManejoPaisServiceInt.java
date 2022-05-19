package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.PaisDto;

import java.util.List;

public interface ManejoPaisServiceInt {
  PaisDto getPais(String id);
  List<PaisDto> getPaises();
  PaisDto savePais(PaisDto pais);
  public PaisDto updatePais(PaisDto paisDto );
  public PaisDto deletePais(String id);
}

