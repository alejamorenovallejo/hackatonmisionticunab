package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.service.MarcaService;
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
public class MarcaController {
    @Autowired
    private MarcaService marcaService;
    
    @RequestMapping(value = "/marca", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMarca(@RequestBody @Validated Marca marca) {
        marcaService.save(marca);
    }

    @RequestMapping(value = "/marca/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Marca> getAllModels() {
        return marcaService.findAll();
    }
    
}
