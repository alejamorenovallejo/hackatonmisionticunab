package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.ProductosFaltantes;
import com.ejemplo.tiendaalamano.repository.ProductosFaltantesRepository;
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
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class ProductosFaltantesController {
    @Autowired
    private ProductosFaltantesRepository productosFaltantesRepository ;

    @RequestMapping(value = "/productosfaltantes/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductosFaltantes> getAllProductosfaltantes() {
        return productosFaltantesRepository.findAll();
    }
    
    @RequestMapping(value = "/productosfaltantes/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProductosFaltantes(@RequestBody @Validated ProductosFaltantes productosFaltantes) {
        productosFaltantesRepository.save(productosFaltantes);
    }
    
}
