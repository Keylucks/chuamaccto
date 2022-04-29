package edu.ilp.chuamaccto.Dao;

import edu.ilp.chuamaccto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona, Long> {
}
