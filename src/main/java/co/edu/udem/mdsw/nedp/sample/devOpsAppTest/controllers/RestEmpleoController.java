package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class RestEmpleoController {
ManejoEmpleoServiceInt manejoEmpleoService;

    @Autowired
   public RestEmpleoController(ManejoEmpleoServiceInt manejoEmpleoService){
        this.manejoEmpleoService = manejoEmpleoService;
    }


    @PostMapping(
            value = "/Empleo", consumes = "application/json", produces = "application/json")
    public BarrioDto CreateEmpleo(@RequestBody EmpleoDto EmpleoDto ) {
              return ResponseEntity.ok().body(manejoEmpleoService.createEmpleo(EmpleoDto));  
    }

    @PostMapping(
            value = "/Empleo", consumes = "application/json", produces = "application/json")
    public BarrioDto updateEmpleo(@RequestBody EmpleoDto EmpleoDto) {
          return ResponseEntity.ok().body(manejoEmpleoService.updateEmpleo(EmpleoDto));
    }


@GetMapping(value = "/Empleo/{id}", produces = "application/json")
    public ResponseEntity<EmpleoDto> getEmpleo(@PathVariable string id){
        return ResponseEntity.ok().body(manejoEmpleoService.getEmpleo(id));
    }

    @GetMapping(value = "/Empleo}", produces = "application/json")
    public ResponseEntity<List<EmpleoDto>> getEmpleo(){
        return ResponseEntity.ok().body(manejoEmpleoService.getEmpleo());
    }

  @PostMapping(
            value = "/Empleo", consumes = "application/json", produces = "application/json")
    public EmpleoDto deleteEmpleo(@RequestBody string id) {
          return ResponseEntity.ok().body(manejoEmpleoService.deleteEmpleo(id));
    }
  
}