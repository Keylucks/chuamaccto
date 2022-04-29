package edu.ilp.chuamaccto.Service.Impl;

import edu.ilp.chuamaccto.Dao.IPersonaDao;
import edu.ilp.chuamaccto.Entity.Persona;
import edu.ilp.chuamaccto.Service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersona {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }
}
