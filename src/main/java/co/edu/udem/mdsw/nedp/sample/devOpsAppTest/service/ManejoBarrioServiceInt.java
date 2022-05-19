package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;

import java.util.List;

public interface ManejoBarrioServiceInt {
  BarrioDto getBarrio(String id);
  List<BarrioDto> getBarrios();
  BarrioDto saveBarrio(BarrioDto barrio);
  public BarrioDto updateBarrio(String id, BarrioDto barrioDto );
  public BarrioDto deleteBarrio(String id);
}

