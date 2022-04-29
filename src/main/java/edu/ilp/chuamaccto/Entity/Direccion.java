package edu.ilp.chuamaccto.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "direccion")
@Inheritance(strategy = InheritanceType.JOINED)
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDireccion", length = 10)
    private Long idDireccion;

    @Column(name = "nombre", length = 100, nullable = false)
    private String calle;

    @Column(name = "ciudad", length = 100, nullable = false)
    private String ciudad;

    @Column(name = "estado", length = 100, nullable = false)
    private String estado;

    @Column(name = "codigoPostal", length = 100, nullable = false)
    private int codigoPostal;

    @Column(name = "pais", length = 100, nullable = false)
    private String pais;


    public Direccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Direccion(String calle, String ciudad, String estado, int codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
