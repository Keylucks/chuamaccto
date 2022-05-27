package edu.ilp.chuamaccto.Service.Impl;

import edu.ilp.chuamaccto.Dao.IEstudianteDao;
import edu.ilp.chuamaccto.Entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private IEstudianteDao estudianteDao;


    public Estudiante obtenerEstuiantePorCodigo(int codigo) {
        return this.estudianteDao.obtenerEstudiantePorParam(codigo);
    }


    public List<Estudiante> listarEstudiantePorApeNombre(String apenombre) {
        return this.estudianteDao.listarEstudiantesByAppNombre(apenombre);
    }
}
