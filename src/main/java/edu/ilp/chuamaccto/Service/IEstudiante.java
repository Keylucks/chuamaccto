package edu.ilp.chuamaccto.Service;

import edu.ilp.chuamaccto.Entity.Estudiante;

import java.util.List;

public interface IEstudiante {
    Estudiante obtenerEstudiantePorCodigo(int codigo);

    //Obtener estudiante mediante su nombre o apellido
    List<Estudiante> listarEstudiantePorApeNombre(String apenombre);
}
