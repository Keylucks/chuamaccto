package edu.ilp.chuamaccto.Dao;


import edu.ilp.chuamaccto.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProfesorDao extends JpaRepository<Profesor, Long> {
    @Override
    List<Profesor> findAllById(Iterable<Long> longs);
}
