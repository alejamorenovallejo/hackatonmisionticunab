package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Cupones;
import com.ejemplo.tiendaalamano.repository.CuponesRepository;
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
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class CuponesController {
    @Autowired
    private CuponesRepository cuponesRepository;
    
    //Crear Cupones
    @RequestMapping(value = "/cupones/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCupones(@RequestBody @Validated Cupones cupones) {
        cuponesRepository.save(cupones);
    }

    //Consultar todos los cupones
    @RequestMapping(value = "/cupones/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Cupones> getAllModels() {
        return cuponesRepository.findAll();
    }
    
    //Consultar cupones por id
    @RequestMapping(value = "/cupones/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cupones> getCuponesById(@PathVariable Long id) {
        return cuponesRepository.findById(id);
    }
    
    //Eliminar cupones por id<<
    @RequestMapping(value = "/cupones/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteCuponesById(@PathVariable Long id) {
        cuponesRepository.deleteById(id);
    }
    
    //Actualizar cupones por id
    @RequestMapping(value = "/cupones/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateCuponesById(@PathVariable Long id,@RequestBody @Validated Cupones cupones) {
        cuponesRepository.save(cupones);
    }
}
