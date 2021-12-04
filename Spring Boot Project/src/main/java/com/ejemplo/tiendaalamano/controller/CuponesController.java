package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Cupones;
import com.ejemplo.tiendaalamano.service.CuponesService;
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
public class CuponesController {
    @Autowired
    private CuponesService cuponesService;
    
    @RequestMapping(value = "/cupones", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCupones(@RequestBody @Validated Cupones cupones) {
        cuponesService.save(cupones);
    }

    @RequestMapping(value = "/cupones/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Cupones> getAllModels() {
        return cuponesService.findAll();
    }
    
}
