package edu.ilp.chuamaccto.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idProfesor")
public class Profesor extends Persona{
    @Column(name = "salario", length = 10, nullable = false)
    private double salario;



    public Profesor(Long idPersona, double salario) {
        super(idPersona);
        this.salario = salario;
    }

    public Profesor(String nombre, int telefono, String email, double salario) {
        super(nombre, telefono, email);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
