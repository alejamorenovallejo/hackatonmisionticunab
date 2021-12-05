/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Categoria;
import com.ejemplo.tiendaalamano.repository.CategoriaRepository;
import com.ejemplo.tiendaalamano.service.CategoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    // Listar todas Las categorias
    @RequestMapping(value = "/categoria/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }
    //Crear una nueva categoria
    @RequestMapping(value = "/categoria/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewCategoria(@RequestBody @Validated Categoria categoria) {
        categoriaRepository.save(categoria);
    }
    
    //Consultar puntos por id
    @RequestMapping(value = "/categoria/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Categoria> getCategoriaById(@PathVariable Long id) {
        return categoriaRepository.findById(id);
    }
    
    //Eliminar puntos por id
    @RequestMapping(value = "/categoria/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategoriaById(@PathVariable Long id) {
        categoriaRepository.deleteById(id);
    }
    
    //Actualizar puntos por id
    @RequestMapping(value = "/categoria/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateCategoriaById(@PathVariable Long id,@RequestBody @Validated Categoria categoria) {
        categoriaRepository.save(categoria);
    } 
    
}
