package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.UsuarioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service.ManejoUsuarioServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestUsuarioController {
    ManejoUsuarioServiceInt manejoUsuarioService;

    @Autowired
    public RestUsuarioController(ManejoUsuarioServiceInt manejoUsuarioService){
        this.manejoUsuarioService = manejoUsuarioService;
    }

    @GetMapping(value = "/usuario/{id}", produces = "application/json")
    public ResponseEntity<UsuarioDto> getUsuario(@PathVariable String id){
        return ResponseEntity.ok().body(manejoUsuarioService.getUsuario(id));
    }

    @GetMapping(value = "/usuario", produces = "application/json")
    public ResponseEntity<List<UsuarioDto>> getUsuario(){
        return ResponseEntity.ok().body(manejoUsuarioService.getUsuarios());
    }


    @PostMapping(
            value = "/usuario", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UsuarioDto> Createusuario(@RequestBody UsuarioDto usuarioDto ) {
              return ResponseEntity.ok().body(manejoUsuarioService.saveUsuario(usuarioDto));  
    }

    @PutMapping(
            value = "/usuario", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UsuarioDto> updateusuario(@RequestBody UsuarioDto usuarioDto) {
          return ResponseEntity.ok().body(manejoUsuarioService.updateUsuario(usuarioDto));
    }

   @DeleteMapping(
            value = "/usuario", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UsuarioDto> deleteusuario(@RequestBody String id) {
          return ResponseEntity.ok().body(manejoUsuarioService.deleteUsuario(id));
    }

}
