package com.xaldigital.retojava.restapi.aeropuerto.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_aeropuertos")
public class Aeropuerto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAeropuerto;

    @Column(name = "nombre_aeropuerto", nullable = false, length = 50)
    private String nombreAeropuerto;

    public Integer getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(Integer idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

}
