package com.xaldigital.retojava.restapi.aeropuerto.model;

import javax.persistence.*;


@Entity
@Table(name = "tbl_aerolineas")
public class Aerolinea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAerolinea;

    @Column(name = "nombre_aerolinea", nullable = false,length = 30)
    private String nombreAerolinea;

    public Integer getIdAerolinea() {
        return idAerolinea;
    }

    public void setIdAerolinea(Integer idAerolinea) {
        this.idAerolinea = idAerolinea;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }


}
