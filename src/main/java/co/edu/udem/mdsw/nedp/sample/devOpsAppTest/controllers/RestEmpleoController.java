package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.EmpleoDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service.ManejoEmpleoServiceInt;
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
public class RestEmpleoController {
    ManejoEmpleoServiceInt manejoEmpleoService;

    @Autowired
    public RestEmpleoController(ManejoEmpleoServiceInt manejoEmpleoService){
        this.manejoEmpleoService = manejoEmpleoService;
    }

    @GetMapping(value = "/empleo/{id}", produces = "application/json")
    public ResponseEntity<EmpleoDto> getEmpleo(@PathVariable String id){
        return ResponseEntity.ok().body(manejoEmpleoService.getEmpleo(id));
    }

    @GetMapping(value = "/empleo", produces = "application/json")
    public ResponseEntity<List<EmpleoDto>> getEmpleo(){
        return ResponseEntity.ok().body(manejoEmpleoService.getEmpleos());
    }


    @PostMapping(
            value = "/empleo", consumes = "application/json", produces = "application/json")
    public ResponseEntity<EmpleoDto> Createempleo(@RequestBody EmpleoDto empleoDto ) {
              return ResponseEntity.ok().body(manejoEmpleoService.saveEmpleo(empleoDto));  
    }

    @PutMapping(
            value = "/empleo", consumes = "application/json", produces = "application/json")
    public ResponseEntity<EmpleoDto> updateempleo(@RequestBody EmpleoDto empleoDto) {
          return ResponseEntity.ok().body(manejoEmpleoService.updateEmpleo(empleoDto));
    }

   @DeleteMapping(
            value = "/empleo", consumes = "application/json", produces = "application/json")
    public ResponseEntity<EmpleoDto> deleteempleo(@RequestBody String id) {
          return ResponseEntity.ok().body(manejoEmpleoService.deleteEmpleo(id));
    }

}
