package com.xaldigital.retojava.restapi.aeropuerto.dto;

import com.xaldigital.retojava.restapi.aeropuerto.model.Aerolinea;

import java.time.LocalDate;
import java.util.Date;

public class VueloDTO {

    private Integer idAerolinea;

    private String nombreAerolinea;

    private Date dia;

    private Integer numVuelos;

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

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Integer getNumVuelos() {
        return numVuelos;
    }

    public void setNumVuelos(Integer numVuelos) {
        this.numVuelos = numVuelos;
    }
}
