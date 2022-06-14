package com.xaldigital.retojava.restapi.aeropuerto.controller;

import com.xaldigital.retojava.restapi.aeropuerto.dto.*;
import com.xaldigital.retojava.restapi.aeropuerto.service.IVueloService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vuelos")
//@CrossOrigin(origins = "*")
public class VueloController {

    @Autowired
    private IVueloService service;

    @Autowired
    private ModelMapper mapper;

    /*@GetMapping
    public ResponseEntity<List<Vuelo>> listar() throws Exception {
        List<Vuelo> lista = service.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }*/

    @GetMapping("/sql/1")
    public ResponseEntity<List<AeropuertoDTO>> obtenerNombreAeropuerto() throws Exception {
        List<AeropuertoI> nomAeropuerto = service.obtenerNombreAeropuerto();

                List<AeropuertoDTO> dto = nomAeropuerto
                                        .stream()
                                        .map(a -> mapper.map(a,AeropuertoDTO.class))
                                        .collect(Collectors.toList());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping("/sql/2")
    public ResponseEntity<List<AerolineaDTO>> obtenerNombreAerolinea() throws Exception {
        List<AerolineaI> nombreAerolinea = service.obtenerNombreAerolinea();

        List<AerolineaDTO> dto = nombreAerolinea
                            .stream()
                            .map(a -> mapper.map(a,AerolineaDTO.class))
                            .collect(Collectors.toList());

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping("/sql/3")
    public ResponseEntity<List<FechaDTO>> obtenerFecha() throws Exception {
        List<FechaI> fec = service.obtenerFechaMayorNumeroVuelos();
                        List<FechaDTO> fechaDTO = fec
                                                .stream()
                                                .map(f -> mapper.map(f, FechaDTO.class))
                                                .collect(Collectors.toList());
        return new ResponseEntity<>(fechaDTO, HttpStatus.OK);
    }

    @GetMapping("/sql/4")
    public ResponseEntity<List<VueloDTO>> obtenerAerolineasDos() throws Exception {
        List<VueloI> vuelos = service.obtenerAerolineasDos();
        List<VueloDTO> dto = vuelos
                            .stream()
                            .map(v -> mapper.map(v,VueloDTO.class))
                            .collect(Collectors.toList());

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    /*@PostMapping
    public ResponseEntity<Vuelo> registrar(@RequestBody Vuelo vuelo) throws Exception {
        Vuelo obj = service.registrar(vuelo);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }*/
}
