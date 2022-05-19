package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.service.ManejoBarrioServiceInt;
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
public class RestBarrioController {
    ManejoBarrioServiceInt manejoBarrioService;

    @Autowired
    public RestBarrioController(ManejoBarrioServiceInt manejoBarrioService){
        this.manejoBarrioService = manejoBarrioService;
    }

    @GetMapping(value = "/barrio/{id}", produces = "application/json")
    public ResponseEntity<BarrioDto> getBarrio(@PathVariable String id){
        return ResponseEntity.ok().body(manejoBarrioService.getBarrio(id));
    }

    @GetMapping(value = "/barrio", produces = "application/json")
    public ResponseEntity<List<BarrioDto>> getBarrio(){
        return ResponseEntity.ok().body(manejoBarrioService.getBarrios());
    }


    @PostMapping(
            value = "/barrio", consumes = "application/json", produces = "application/json")
    public ResponseEntity<BarrioDto> Createbarrio(@RequestBody BarrioDto barrioDto ) {
              return ResponseEntity.ok().body(manejoBarrioService.saveBarrio(barrioDto));  
    }

    @PutMapping(
            value = "/barrio/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<BarrioDto> updatebarrio(@PathVariable String id, @RequestBody BarrioDto barrioDto) {
          return ResponseEntity.ok().body(manejoBarrioService.updateBarrio(id, barrioDto));
    }

   @DeleteMapping(
            value = "/barrio/{id}", produces = "application/json")
    public ResponseEntity<BarrioDto> deletebarrio(@PathVariable String id) {
          return ResponseEntity.ok().body(manejoBarrioService.deleteBarrio(id));
    }

}
