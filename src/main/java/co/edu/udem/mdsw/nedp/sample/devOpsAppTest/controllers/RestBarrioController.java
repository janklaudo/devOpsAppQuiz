package co.edu.udem.mdsw.nedp.sample.devOpsAppTest.controllers;

import co.edu.udem.mdsw.nedp.sample.devOpsAppTest.entities.BarrioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class RestBarrioController {
ManejoBarrioServiceInt manejoUsuarioService;

    @Autowired
   public RestBarriosController(ManejoBarrioServiceInt manejoBarrioService){
        this.manejoBarrioService = manejoBarrioService;
    }


    @PostMapping(
            value = "/barrio", consumes = "application/json", produces = "application/json")
    public BarrioDto CreateBarrio(@RequestBody BarrioDto barrioDto ) {
              return ResponseEntity.ok().body(manejoBarrioService.createBarrio(barrioDto));  
    }

    @PostMapping(
            value = "/barrio", consumes = "application/json", produces = "application/json")
    public BarrioDto updateBarrio(@RequestBody BarrioDto barrioDto) {
          return ResponseEntity.ok().body(manejoBarrioService.updateBarrio(barrioDto));
    }

 @GetMapping(value = "/barrio/{id}", produces = "application/json")
    public ResponseEntity<UsuarioDto> getbarrio(@PathVariable string id){
        return ResponseEntity.ok().body(manejobarrioService.getbarrio(id));
    }

    @GetMapping(value = "/barrio}", produces = "application/json")
    public ResponseEntity<List<barrioDto>> getbarrio(){
        return ResponseEntity.ok().body(manejobarrioService.getbarrio());
    }

  @PostMapping(
            value = "/barrio", consumes = "application/json", produces = "application/json")
    public BarrioDto deletebarrio(@RequestBody string id) {
          return ResponseEntity.ok().body(manejobarrioService.deletebarrio(id));
    }
  
}
