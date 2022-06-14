package com.xaldigital.retojava.restapi.aeropuerto.service.impl;

import com.xaldigital.retojava.restapi.aeropuerto.model.Aerolinea;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IAerolineaRepo;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IGenericRepo;
import com.xaldigital.retojava.restapi.aeropuerto.service.IAerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AerolineaServiceImpl extends CRUDImpl<Aerolinea,Integer> implements IAerolineaService {

    @Autowired
    private IAerolineaRepo repo;
    @Override
    protected IGenericRepo<Aerolinea, Integer> getRepo() {
        return repo;
    }
}
