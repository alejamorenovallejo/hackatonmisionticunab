package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import com.ejemplo.tiendaalamano.repository.DomiciliarioRepository;
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
public class DomiciliarioController {
    @Autowired
    private DomiciliarioRepository domiciliarioRepository;
    
     //Crear Cupones
    @RequestMapping(value = "/domiciliario/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createDomiciliario(@RequestBody @Validated Domiciliario domiciliario) {
        domiciliarioRepository.save(domiciliario);
    }

    //Consultar todos los domiciliarios    
    @RequestMapping(value = "/domiciliario/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Domiciliario> getAllModels() {
        return domiciliarioRepository.findAll();
    }
    //Consultar domiciliario por id
    @RequestMapping(value = "/domiciliario/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Domiciliario> getCuponesById(@PathVariable Long id) {
        return domiciliarioRepository.findById(id);
    }
    
    //Eliminar domiciliario por id<<
    @RequestMapping(value = "/domiciliario/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteDomiciliarioById(@PathVariable Long id) {
        domiciliarioRepository.deleteById(id);
    }
    
    //Actualizar domiciliario por id
    @RequestMapping(value = "/domiciliario/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateDomiciliarioById(@PathVariable Long id,@RequestBody @Validated Domiciliario domiciliario) {
        domiciliarioRepository.save(domiciliario);
    }
}


