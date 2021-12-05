package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.RangoEntrega;
import com.ejemplo.tiendaalamano.repository.RangoEntregaRepository;
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
public class RangoEntregaController {
    @Autowired
    private RangoEntregaRepository rangoentregaRepository;
    
    //Consultar todos los rangos de entrega
    @RequestMapping(value = "/rangoentrega/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<RangoEntrega> getAllRangoEntrega() {
        return rangoentregaRepository.findAll();
    }
    
     //Crear Puntos
    @RequestMapping(value = "/rangoentrega/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createRangoEntrega(@RequestBody @Validated RangoEntrega rangoentrega) {
        rangoentregaRepository.save(rangoentrega);
    }

    //Consultar puntos por id
    @RequestMapping(value = "/rangoentrega/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<RangoEntrega> getRangoEntregaById(@PathVariable Long id) {
        return rangoentregaRepository.findById(id);
    }
    
    //Eliminar puntos por id
    @RequestMapping(value = "/rangoentrega/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteRangoEntregaById(@PathVariable Long id) {
        rangoentregaRepository.deleteById(id);
    }
    
    //Actualizar puntos por id
    @RequestMapping(value = "/rangoentrega/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateRangoEntregaById(@PathVariable Long id,@RequestBody @Validated RangoEntrega rangoentrega) {
        rangoentregaRepository.save(rangoentrega);
    }
}
