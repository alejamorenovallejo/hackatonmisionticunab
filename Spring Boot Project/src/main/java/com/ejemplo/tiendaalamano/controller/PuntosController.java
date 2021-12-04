package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Puntos;
import com.ejemplo.tiendaalamano.repository.PuntosRepository;
import com.ejemplo.tiendaalamano.service.PuntosService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */

@RestController
@RequestMapping("/api")
public class PuntosController {
    @Autowired
    private PuntosRepository puntosRepository;
    private PuntosService puntosService;

    
    @RequestMapping(value = "/puntos/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Puntos> getAllModels() {
        return puntosRepository.findAll();
    }
    
    @RequestMapping(value = "/puntos/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPuntos(@RequestBody @Validated Puntos puntos) {
        puntosRepository.save(puntos);
    }
    
    /*@RequestMapping(value = "/puntos/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Puntos getPuntosById(Long id) {
        return puntosRepository.getById(id);
    }*/
    
}
