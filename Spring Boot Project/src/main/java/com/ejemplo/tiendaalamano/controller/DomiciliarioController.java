package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import com.ejemplo.tiendaalamano.service.DomiciliarioService;
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
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class DomiciliarioController {
    @Autowired
    private DomiciliarioService domiciliarioService;
    
    @RequestMapping(value = "/domiciliario", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createDomiciliario(@RequestBody @Validated Domiciliario domiciliario) {
        domiciliarioService.save(domiciliario);
    }

    @RequestMapping(value = "/domiciliario/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Domiciliario> getAllModels() {
        return domiciliarioService.findAll();
    }
    
}
