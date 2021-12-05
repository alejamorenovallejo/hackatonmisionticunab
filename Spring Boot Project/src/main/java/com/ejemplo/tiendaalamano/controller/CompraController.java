/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Compra;
import com.ejemplo.tiendaalamano.repository.CompraRepository;
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

@RestController
@RequestMapping("/api")
public class CompraController {
    @Autowired
    private CompraRepository compraRepository;
    
    //Traer todas las compras
    @RequestMapping(value = "/compra/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Compra> getAllcompra() {
        return compraRepository.findAll();
    }
    
    //Crear Compra
    @RequestMapping(value = "/compra/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCompra(@RequestBody @Validated Compra compra) {
        compraRepository.save(compra);
    }
    
    //Consultar compra por id
    @RequestMapping(value = "/compra/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Compra> getCompraById(@PathVariable Long id) {
        return compraRepository.findById(id);
    }
    
    //Eliminar compra por id
    @RequestMapping(value = "/compra/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteCompraById(@PathVariable Long id) {
        compraRepository.deleteById(id);
    }
    
    //Actualizar compra por id
    @RequestMapping(value = "/compra/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateCompraById(@PathVariable Long id,@RequestBody @Validated Compra compra) {
        compraRepository.save(compra);
    }
}
