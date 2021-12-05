package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Producto;
import com.ejemplo.tiendaalamano.repository.ProductoRepository;
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
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;
    
    @RequestMapping(value = "/producto/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProducto(@RequestBody @Validated Producto producto) {
        productoRepository.save(producto);
    }
    
    @RequestMapping(value = "/producto/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    //Consultar producto por id
    @RequestMapping(value = "/producto/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Producto> getProductoById(@PathVariable Long id) {
        return productoRepository.findById(id);
    }
    
    //Eliminar producto por id
    @RequestMapping(value = "/producto/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteProductoById(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }
    
    //Actualizar producto por id
    @RequestMapping(value = "/producto/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateProductoById(@PathVariable Long id,@RequestBody @Validated Producto producto) {
        productoRepository.save(producto);
    }
}
