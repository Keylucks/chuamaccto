package edu.ilp.chuamaccto.Controller;

import edu.ilp.chuamaccto.Entity.Persona;
import edu.ilp.chuamaccto.Service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    private IPersona personaService;

    @GetMapping("/litaPersona")
    public List<Persona> listaEscuelas(){
        return  this.personaService.listarPersona();
    }
}
