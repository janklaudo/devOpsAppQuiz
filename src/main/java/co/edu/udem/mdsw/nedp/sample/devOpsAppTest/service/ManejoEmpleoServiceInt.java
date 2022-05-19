package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.EmpleoDto;

import java.util.List;

public interface ManejoEmpleoServiceInt {
  EmpleoDto getEmpleo(String id);
  List<EmpleoDto> getEmpleos();
  EmpleoDto saveEmpleo(EmpleoDto empleo);
  public EmpleoDto updateEmpleo(EmpleoDto empleoDto );
  public EmpleoDto deleteEmpleo(String id);
}

