package com.xaldigital.retojava.restapi.aeropuerto.service;

import java.util.List;

public interface ICRUD <T,ID>{

    T registrar(T t) throws Exception;
    List<T> listar() throws Exception;
    T listarPorId(ID id) throws Exception;



}
