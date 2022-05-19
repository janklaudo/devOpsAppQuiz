package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;

import java.util.List;

public interface ManejoUsuarioServiceInt {
  UsuarioDto getUsuario(String id);
  List<UsuarioDto> getUsuarios();
  UsuarioDto saveUsuario(UsuarioDto usuario);
  UsuarioDto updateUsuario(UsuarioDto usuarioDto );
  UsuarioDto deleteUsuario(String id);
}

