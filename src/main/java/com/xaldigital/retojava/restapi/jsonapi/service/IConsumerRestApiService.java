package com.xaldigital.retojava.restapi.jsonapi.service;

import com.xaldigital.retojava.restapi.jsonapi.dto.ConsumerDTO;
import com.xaldigital.retojava.restapi.jsonapi.dto.OwnerDTO;
import com.xaldigital.retojava.restapi.jsonapi.model.Items;
import com.xaldigital.retojava.restapi.jsonapi.model.Owner;

import java.util.List;

public interface IConsumerRestApiService {

    List<ConsumerDTO> obtenerRespondidos() throws Exception;

    List<ConsumerDTO> obtenerNoRespondidos() throws Exception;

    List<OwnerDTO> obtenerMayorReputacion() throws Exception;

    List<ConsumerDTO> obtenerMenorNumeroVisitas() throws Exception;

    List<ConsumerDTO> obtenerRespuestasMasAntigua() throws Exception;

    List<ConsumerDTO> obtenerRespuestasMasActual() throws Exception;

}
