package edu.ilp.chuamaccto.Dao;


import edu.ilp.chuamaccto.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor, Long> {
}
