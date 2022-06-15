package com.xaldigital.retojava.restapi.aeropuerto.controller;

import com.xaldigital.retojava.restapi.aeropuerto.model.Aeropuerto;
import com.xaldigital.retojava.restapi.aeropuerto.service.IAeropuetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeropuertos")
public class AeropuertoController {

    @Autowired
    private IAeropuetoService service;

    /*@GetMapping
    public ResponseEntity<List<Aeropuerto>> listar() throws Exception {
        List<Aeropuerto> lista = service.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Aeropuerto> registrar(@RequestBody Aeropuerto aeropuerto) throws Exception {
        Aeropuerto obj = service.registrar(aeropuerto);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }*/
}
