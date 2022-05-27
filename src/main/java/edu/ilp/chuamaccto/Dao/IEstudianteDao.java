package edu.ilp.chuamaccto.Dao;

import edu.ilp.chuamaccto.Entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante, Long> {
    Estudiante findByCodigoEstudiante(int codigo);

    @Query("SELECT e FROM Estudiante e WHERE e.codigoEstudiante = ?1")
    Estudiante obtenerEstudiantePorCodigo(int codigo);

    @Query("SELECT e FROM Estudiante e WHERE e.codigoEstudiante = :codigo")
    Estudiante obtenerEstudiantePorParam(@Param("codigo") int codigo);

    //Lista estudiante por apellido o nombre
    @Query("SELECT e FROM Estudiante e WHERE e.nombre LIKE CONCAT('%',:appnombre,'%') OR e.apellido LIKE CONCAT('%',:appnombre,'%') ")
    List<Estudiante> listarEstudiantesByAppNombre(@Param("appnombre") String appnombre);
}
