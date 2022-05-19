package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class RestPaisController {
ManejoPaisServiceInt manejoPaisService;

    @Autowired
   public RestPaisController(ManejoPaisServiceInt manejoPaisService){
        this.manejoPaisService = manejoPaisService;
    }


    @PostMapping(
            value = "/Pais", consumes = "application/json", produces = "application/json")
    public BarrioDto CreatePais(@RequestBody PaisDto PaisDto ) {
              return ResponseEntity.ok().body(manejoPaisService.createPais(PaisDto));  
    }

    @PostMapping(
            value = "/Pais", consumes = "application/json", produces = "application/json")
    public BarrioDto updatePais(@RequestBody PaisDto PaisDto) {
          return ResponseEntity.ok().body(manejoPaisService.updateEmpleo(PaisDto));
    }

@GetMapping(value = "/Pais/{id}", produces = "application/json")
    public ResponseEntity<PaisDto> getPais(@PathVariable string id){
        return ResponseEntity.ok().body(manejoPaisService.getPais(id));
    }

    @GetMapping(value = "/Pais}", produces = "application/json")
    public ResponseEntity<List<PaisDto>> getPais(){
        return ResponseEntity.ok().body(manejoPaisService.getPais());
    }

  @PostMapping(
            value = "/Pais", consumes = "application/json", produces = "application/json")
    public PaisDto deletePais(@RequestBody string id) {
          return ResponseEntity.ok().body(manejoPaisService.deletePais(id));
    }

  
}