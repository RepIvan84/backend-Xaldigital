package com.xaldigital.retojava.restapi.aeropuerto.service.impl;

import com.xaldigital.retojava.restapi.aeropuerto.repo.IGenericRepo;
import com.xaldigital.retojava.restapi.aeropuerto.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T,ID> implements ICRUD<T,ID> {

    protected abstract IGenericRepo<T,ID> getRepo();

    @Override
    public T registrar(T t) throws Exception {
        return getRepo().save(t);
    }

    @Override
    public List<T> listar() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T listarPorId(ID id) throws Exception {
        return getRepo().findById(id).orElse(null);
    }
}
