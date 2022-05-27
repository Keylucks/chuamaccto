package edu.ilp.chuamaccto.Controller;

import edu.ilp.chuamaccto.Entity.Estudiante;
import edu.ilp.chuamaccto.Service.IEstudiante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class EstudianteController {
    private IEstudiante estudianteService;

    @GetMapping("/listarByAppnombre/{appnombre}")
    public List<Estudiante> listarPorApellidoNombre(@PathVariable String appnombre){
        return this.estudianteService.listarEstudiantePorApeNombre(appnombre);
    }
}
