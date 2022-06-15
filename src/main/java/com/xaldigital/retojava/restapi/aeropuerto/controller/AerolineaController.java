package com.xaldigital.retojava.restapi.aeropuerto.controller;

import com.xaldigital.retojava.restapi.aeropuerto.model.Aerolinea;
import com.xaldigital.retojava.restapi.aeropuerto.service.IAerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aerolineas")
public class AerolineaController {

    @Autowired
    private IAerolineaService service;

   /* @GetMapping
    public ResponseEntity<List<Aerolinea>> listar() throws Exception {
        List<Aerolinea> lista = service.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Aerolinea> registrar(@RequestBody Aerolinea aerolinea) throws Exception {
        Aerolinea obj = service.registrar(aerolinea);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }*/
}