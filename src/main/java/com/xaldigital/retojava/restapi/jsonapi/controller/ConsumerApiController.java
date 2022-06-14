package com.xaldigital.retojava.restapi.jsonapi.controller;

import com.xaldigital.retojava.restapi.jsonapi.dto.ConsumerDTO;
import com.xaldigital.retojava.restapi.jsonapi.dto.OwnerDTO;
import com.xaldigital.retojava.restapi.jsonapi.model.Items;
import com.xaldigital.retojava.restapi.jsonapi.service.IConsumerRestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Api")
public class ConsumerApiController {

    @Autowired
    IConsumerRestApiService service;

    @GetMapping("/respondidos")
    public ResponseEntity<List<ConsumerDTO>> obtenerRespondidos() throws Exception {
            List<ConsumerDTO> resp = service.obtenerRespondidos();
            return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/NoRespondidos")
    public ResponseEntity<List<ConsumerDTO>> obtenerNoRespondidos() throws Exception {
        List<ConsumerDTO> resp = service.obtenerNoRespondidos();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/mayorReputacion")
    public ResponseEntity<List<OwnerDTO>> obtenerMayorReputacion() throws Exception {
        List<OwnerDTO> resp = service.obtenerMayorReputacion();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/menorNumeroVisitas")
    public ResponseEntity<List<ConsumerDTO>> obtenerMenorNumeroVisitas() throws Exception {
        List<ConsumerDTO> resp = service.obtenerMenorNumeroVisitas();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/respuestaMasAntigua")
    public ResponseEntity<List<ConsumerDTO>> obtenerRespuestasMasAntigua() throws Exception {
        List<ConsumerDTO> resp = service.obtenerRespuestasMasAntigua();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/respuestaMasActual")
    public ResponseEntity<List<ConsumerDTO>> obtenerRespuestasMasActual() throws Exception {
        List<ConsumerDTO> resp = service.obtenerRespuestasMasActual();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
}
