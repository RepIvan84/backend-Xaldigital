package com.xaldigital.retojava.restapi.aeropuerto.service.impl;

import com.xaldigital.retojava.restapi.aeropuerto.model.Movimiento;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IGenericRepo;
import com.xaldigital.retojava.restapi.aeropuerto.repo.IMovimientoRepo;
import com.xaldigital.retojava.restapi.aeropuerto.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimientoServiceImpl extends CRUDImpl<Movimiento,Integer> implements IMovimientoService {

    @Autowired
    private IMovimientoRepo repo;
    @Override
    protected IGenericRepo<Movimiento, Integer> getRepo() {
        return repo;
    }
}
