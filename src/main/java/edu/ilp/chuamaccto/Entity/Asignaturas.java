package edu.ilp.chuamaccto.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "asignatura")
@PrimaryKeyJoinColumn(referencedColumnName="IDPROFESOR")
public class Asignaturas {

    private int codAsig;
    private String nombre;
    private int creditos;
    private String siglas;
    private int duracion;

    public Asignaturas(int codAsig) {
        this.codAsig = codAsig;
    }

    public Asignaturas(String nombre, int creditos, String siglas, int duracion) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.siglas = siglas;
        this.duracion = duracion;
    }

    public int getCodAsig() {
        return codAsig;
    }

    public void setCodAsig(int codAsig) {
        this.codAsig = codAsig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
