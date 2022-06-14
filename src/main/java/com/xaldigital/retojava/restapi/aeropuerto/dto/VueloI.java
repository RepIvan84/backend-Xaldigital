package com.xaldigital.retojava.restapi.aeropuerto.dto;

import java.util.Date;

public interface VueloI {

    Integer getIdAerolinea();

    String getNombreAerolinea();

    Date getDia();

    Integer getNumVuelos();
}
