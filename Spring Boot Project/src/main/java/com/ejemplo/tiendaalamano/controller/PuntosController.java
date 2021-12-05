package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Puntos;
import com.ejemplo.tiendaalamano.repository.PuntosRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
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

    //Consultar todos los puntos
    @RequestMapping(value = "/puntos/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Puntos> getAllPuntos() {
        return puntosRepository.findAll();
    }
    
    //Crear Puntos
    @RequestMapping(value = "/puntos/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPuntos(@RequestBody @Validated Puntos puntos) {
        puntosRepository.save(puntos);
    }

    //Consultar puntos por id
    @RequestMapping(value = "/puntos/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Puntos> getPuntosById(@PathVariable Long id) {
        return puntosRepository.findById(id);
    }
    
    //Eliminar puntos por id
    @RequestMapping(value = "/puntos/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePuntosById(@PathVariable Long id) {
        puntosRepository.deleteById(id);
    }
    
    //Actualizar puntos por id
    @RequestMapping(value = "/puntos/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updatePuntosById(@PathVariable Long id,@RequestBody @Validated Puntos puntos) {
        puntosRepository.save(puntos);
    }
    
    
}
