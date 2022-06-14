package com.xaldigital.retojava.restapi.aeropuerto.service;

import com.xaldigital.retojava.restapi.aeropuerto.dto.AerolineaI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.AeropuertoI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.FechaI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.VueloI;
import com.xaldigital.retojava.restapi.aeropuerto.model.Vuelo;

import java.util.Date;
import java.util.List;

public interface IVueloService extends ICRUD<Vuelo,Integer>{

    List<AeropuertoI> obtenerNombreAeropuerto() throws Exception;

    List<AerolineaI> obtenerNombreAerolinea() throws Exception;
    List<FechaI> obtenerFechaMayorNumeroVuelos() throws Exception;

    List<VueloI> obtenerAerolineasDos() throws Exception;


}
