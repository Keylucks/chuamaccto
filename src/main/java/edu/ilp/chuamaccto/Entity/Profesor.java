package edu.ilp.chuamaccto.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Profesor extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idprofesor",length = 20,nullable = false)
    private Long idProfesor;

    @Column(name = "salario", length = 10, nullable = false)
    private double salario;

    @OneToOne
    @JoinColumn(name = "idpersona",referencedColumnName = "idpersona")
    private Persona persona;

    @ManyToMany
    @JoinTable(name = "profesorasignatura",joinColumns = @JoinColumn(name = "idprofesor"),
            inverseJoinColumns = @JoinColumn(name = "idAsig"))
    private final Set<Asignaturas> asig = new HashSet<>();

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
