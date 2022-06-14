package com.xaldigital.retojava.restapi.aeropuerto.repo;

import com.xaldigital.retojava.restapi.aeropuerto.dto.AerolineaI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.AeropuertoI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.FechaI;
import com.xaldigital.retojava.restapi.aeropuerto.dto.VueloI;
import com.xaldigital.retojava.restapi.aeropuerto.model.Vuelo;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface IVueloRepo extends IGenericRepo<Vuelo,Integer>{

    @Query(
            value = "SELECT dia \n" +
                    "\t\tFROM tbl_vuelos v\n" +
                    "\t\tGROUP BY v.dia\n" +
                    "\t\tORDER BY count(v.dia) DESC\n" +
                    "\t\tLIMIT 1",
            nativeQuery = true
    )
    List<FechaI> obtenerFechaMayorNumeroVuelos();

    @Query(
            value = "select v.id_aerolinea as idAerolinea," +
                    "a.nombre_aerolinea as nombreAerolinea \n" +
                    "\tfrom tbl_vuelos v\n" +
                    "\tinner join tbl_aerolineas a\n" +
                    "\t\ton v.id_aerolinea = a.id_aerolinea\n" +
                    "\tgroup by v.id_aerolinea,a.nombre_aerolinea\n" +
                    "\torder by count(v.id_aerolinea) desc\n" +
                    "\tlimit 1",
            nativeQuery = true
    )
    List<AerolineaI> obtenerNombreAerolinea();

    @Query(
            value = "select v.id_aeropuerto as idAeropuerto, " +
                    "a.nombre_aeropuerto as nombreAeropuerto  \n" +
                    "\tfrom tbl_vuelos v\n" +
                    "\tinner join tbl_aeropuertos a\n" +
                    "\t\ton v.id_aeropuerto = a.id_aeropuerto\n" +
                    "\tgroup by v.id_aeropuerto,a.nombre_aeropuerto\n" +
                    "\torder by count(v.id_aeropuerto) desc\n" +
                    "\tlimit 1",
            nativeQuery = true
    )
    List<AeropuertoI> obtenerNombreAeropuerto();


    @Query(
            value = "select v.id_aerolinea as idAerolinea,\n" +
                    "                    a.nombre_aerolinea as nombreAerolinea,\n" +
                    "\t\t\t\t\tv.dia as dia, count(*) as numvuelos\n" +
                    "                    from tbl_vuelos v\n" +
                    "                    inner join tbl_aerolineas a\n" +
                    "                    on v.id_aerolinea = a.id_aerolinea\n" +
                    "                    group by v.id_aerolinea,v.dia,a.nombre_aerolinea\n" +
                    "                    having count(v.dia) = 2",
            nativeQuery = true
    )
    List<VueloI> obtenerAerolineasDos();





}
