package com.xaldigital.retojava.restapi.aeropuerto.service.impl;

import com.xaldigital.retojava.restapi.aeropuerto.dto.AerolineaI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.AeropuertoI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.FechaI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.VueloI;
import com.xaldigital.retojava.restapi.aeropuerto.model.Vuelo;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IGenericRepo;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IVueloRepo;
import com.xaldigital.retojava.restapi.aeropuerto.service.IVueloService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class VueloServiceImpl extends CRUDImpl<Vuelo, Integer> implements IVueloService {
    @Autowired
    private IVueloRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    protected IGenericRepo<Vuelo, Integer> getRepo() {
        return repo;
    }

    @Override
    public List<FechaI> obtenerFechaMayorNumeroVuelos() throws Exception {
        return repo.obtenerFechaMayorNumeroVuelos();
    }

    @Override
    public List<AeropuertoI> obtenerNombreAeropuerto() throws Exception {
        List<AeropuertoI> nombreAeropuerto = repo.obtenerNombreAeropuerto();

        return nombreAeropuerto;
    }

    @Override
    public List<AerolineaI> obtenerNombreAerolinea() throws Exception {
        List<AerolineaI> nombreAerolinea = repo.obtenerNombreAerolinea();
        return nombreAerolinea;
    }

    @Override
    public List<VueloI> obtenerAerolineasDos() throws Exception {
        List<VueloI> aerolineas = repo.obtenerAerolineasDos();
        return aerolineas;
    }
}
