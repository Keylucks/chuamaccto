package edu.ilp.chuamaccto.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class Estudiante extends Persona{
    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 10)
    private String serie;


    public Estudiante(Long idPersona, String codigo, String serie) {
        super(idPersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(String nombre, int telefono, String email, String codigo, String serie) {
        super(nombre, telefono, email);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
