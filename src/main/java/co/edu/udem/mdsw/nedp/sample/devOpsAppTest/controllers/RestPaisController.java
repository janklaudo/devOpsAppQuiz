package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.PaisDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service.ManejoPaisServiceInt;
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
public class RestPaisController {
    ManejoPaisServiceInt manejoPaisService;

    @Autowired
    public RestPaisController(ManejoPaisServiceInt manejoPaisService){
        this.manejoPaisService = manejoPaisService;
    }

    @GetMapping(value = "/pais/{id}", produces = "application/json")
    public ResponseEntity<PaisDto> getPais(@PathVariable String id){
        return ResponseEntity.ok().body(manejoPaisService.getPais(id));
    }

    @GetMapping(value = "/pais", produces = "application/json")
    public ResponseEntity<List<PaisDto>> getPais(){
        return ResponseEntity.ok().body(manejoPaisService.getPaises());
    }


    @PostMapping(
            value = "/pais", consumes = "application/json", produces = "application/json")
    public ResponseEntity<PaisDto> Createpais(@RequestBody PaisDto paisDto ) {
              return ResponseEntity.ok().body(manejoPaisService.savePais(paisDto));  
    }

    @PutMapping(
            value = "/pais", consumes = "application/json", produces = "application/json")
    public ResponseEntity<PaisDto> updatepais(@RequestBody PaisDto paisDto) {
          return ResponseEntity.ok().body(manejoPaisService.updatePais(paisDto));
    }

   @DeleteMapping(
            value = "/pais", consumes = "application/json", produces = "application/json")
    public ResponseEntity<PaisDto> deletepais(@RequestBody String id) {
          return ResponseEntity.ok().body(manejoPaisService.deletePais(id));
    }

}
