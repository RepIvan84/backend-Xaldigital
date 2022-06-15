package com.xaldigital.retojava.restapi.aeropuerto.controller;

import com.xaldigital.retojava.restapi.aeropuerto.model.Movimiento;
import com.xaldigital.retojava.restapi.aeropuerto.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {

    @Autowired
    private IMovimientoService service;

   /* @GetMapping
    public ResponseEntity<List<Movimiento>> listar() throws Exception {
        List<Movimiento> lista = service.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Movimiento> registrar(@RequestBody Movimiento movimiento) throws Exception {
        Movimiento obj = service.registrar(movimiento);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }*/
}
