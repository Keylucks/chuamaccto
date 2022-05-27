package edu.ilp.chuamaccto.Dao;

import edu.ilp.chuamaccto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPersonaDao extends JpaRepository<Persona, Long> {
    @Override
    List<Persona> findAll();
}
