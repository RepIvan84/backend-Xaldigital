package com.xaldigital.retojava.restapi.jsonapi.service.impl;

import com.xaldigital.retojava.restapi.jsonapi.dto.ConsumerDTO;
import com.xaldigital.retojava.restapi.jsonapi.dto.OwnerDTO;
import com.xaldigital.retojava.restapi.jsonapi.model.Consumer;
import com.xaldigital.retojava.restapi.jsonapi.model.Items;
import com.xaldigital.retojava.restapi.jsonapi.model.Owner;
import com.xaldigital.retojava.restapi.jsonapi.service.IConsumerRestApiService;
import com.xaldigital.retojava.restapi.jsonapi.utils.RestConsumer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;


@Service
public class ConsumerRespApiServiceImpl implements IConsumerRestApiService {

    @Autowired
    RestConsumer apiRestconsumer;

    @Autowired
    ModelMapper mapper;


    @Override
    public List<ConsumerDTO> obtenerRespondidos() throws Exception {

        Consumer consumer = apiRestconsumer.getConsumerData();

        List<Items> items = consumer.getItems();

        List<Items> respondidos = items
                .stream()
                .filter(r -> r.isIs_answered() == true)
                .collect(Collectors.toList());

        System.out.println("Numero Objetos con respuestas contestadas: " + respondidos.size());
        System.out.println("Objetos con respuestas contestadas: " + respondidos);

        List<ConsumerDTO> dtoConsumers = respondidos
                                        .stream()
                                        .map(c -> mapper.map(c,ConsumerDTO.class))
                                        .collect(Collectors.toList());

        return dtoConsumers;
    }

    @Override
    public List<ConsumerDTO> obtenerNoRespondidos() throws Exception {


        Consumer consumer = apiRestconsumer.getConsumerData();

        List<Items> items = consumer.getItems();

        List<Items> noRespondidos = items
                .stream()
                .filter(r -> r.isIs_answered() == false)
                .collect(Collectors.toList());

        System.out.println("Numero Objetos con respuestas No contestadas: " + noRespondidos.size());
        System.out.println("Objetos con respuestas No contestadas: " + noRespondidos);

        List<ConsumerDTO> dtoConsumers = noRespondidos
                .stream()
                .map(c -> mapper.map(c,ConsumerDTO.class))
                .collect(Collectors.toList());

        return dtoConsumers;
    }

    @Override
    public List<OwnerDTO> obtenerMayorReputacion() throws Exception {

        Consumer consumer = apiRestconsumer.getConsumerData();

        List<Owner> owners = new ArrayList<>(); //Preparamos la lista contenedora de Owner's

        consumer.getItems()//Filtramos la lista de Owner's que contiene el dato reputacion
                .stream()
                .map(o -> o.getOwner())
                .forEach(o -> owners.add(o));

        Owner maxOwnerReputation = owners //Obtenemos el Owner con mayor reputacion
                .stream()
                .filter(o -> o.getReputation() != null)
                .max(Comparator.comparing(Owner::getReputation))
                .orElseThrow(NoSuchElementException::new);

          List<OwnerDTO> dtoList = new ArrayList<>();
        OwnerDTO dto = mapper.map(maxOwnerReputation, OwnerDTO.class);

        dtoList.add(dto);

        return dtoList;

    }

    @Override
    public List<ConsumerDTO> obtenerMenorNumeroVisitas() throws Exception {

        Consumer consumer = apiRestconsumer.getConsumerData();

        List<Items> items = consumer.getItems();

        Items menorNumeroVistas = items //Obtenemos el objecto menor numero de vistas
                .stream()
                .filter(o -> o.getView_count() != null)
                .min(Comparator.comparing(Items::getView_count))
                .orElseThrow(NoSuchElementException::new);

        List<ConsumerDTO> dtoList = new ArrayList<>();
        ConsumerDTO dto = mapper.map(menorNumeroVistas, ConsumerDTO.class);

        dtoList.add(dto);

        return dtoList;
    }

    @Override
    public List<ConsumerDTO> obtenerRespuestasMasAntigua() throws Exception {

        Consumer consumer = apiRestconsumer.getConsumerData();

        List<Items> items = consumer.getItems();

        Items  respuestaAntigua = items
                .stream()
                .filter(old -> old.getCreation_date() != null)
                .min(Comparator.comparing(Items::getCreation_date))
                .orElseThrow(NoSuchElementException::new);

        List<ConsumerDTO> dtoList = new ArrayList<>();
        ConsumerDTO dto = mapper.map(respuestaAntigua, ConsumerDTO.class);

        dtoList.add(dto);

        return dtoList;
    }

    @Override
    public List<ConsumerDTO> obtenerRespuestasMasActual() throws Exception {
        Consumer consumer = apiRestconsumer.getConsumerData();

        List<Items> items = consumer.getItems();

        Items  respuestaActual = items
                .stream()
                .filter(old -> old.getCreation_date() != null)
                .max(Comparator.comparing(Items::getCreation_date))
                .orElseThrow(NoSuchElementException::new);

        List<ConsumerDTO> dtoList = new ArrayList<>();
        ConsumerDTO dto = mapper.map(respuestaActual, ConsumerDTO.class);

        dtoList.add(dto);

        return dtoList;
    }
}
