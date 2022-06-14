package com.xaldigital.retojava.restapi.aeropuerto.service.impl;

import com.xaldigital.retojava.restapi.aeropuerto.model.Aeropuerto;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IAeropuertoRepo;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IGenericRepo;
import com.xaldigital.retojava.restapi.aeropuerto.service.IAeropuetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeropuertoServiceImpl extends CRUDImpl<Aeropuerto,Integer> implements IAeropuetoService {

    @Autowired
    private IAeropuertoRepo repo;
    @Override
    protected IGenericRepo<Aeropuerto, Integer> getRepo() {
        return repo;
    }
}
