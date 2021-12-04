package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Producto;
import com.ejemplo.tiendaalamano.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;
    
    @RequestMapping(value = "/producto/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }
}
