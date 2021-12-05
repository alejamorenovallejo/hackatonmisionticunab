/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Comentarios;
import com.ejemplo.tiendaalamano.repository.ComentariosRepository;
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
public class ComentariosController {
    
    @Autowired
    private ComentariosRepository comentariosRepository;
    
    //Consultar todos los Comentarios
    @RequestMapping(value = "/comentarios/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Comentarios> getAllComentarios() {
        return comentariosRepository.findAll();
    }
    
    //Crear Comentarios
    @RequestMapping(value = "/comentarios/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createComentarios(@RequestBody @Validated Comentarios comentarios) {
        comentariosRepository.save(comentarios);
    }
    
    //Consultar Comentarios por id
    @RequestMapping(value = "/comentarios/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Comentarios> getComentariosById(@PathVariable Long id) {
        return comentariosRepository.findById(id);
    }
    
    //Eliminar comentarios por id
    @RequestMapping(value = "/comentarios/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteComentariosById(@PathVariable Long id) {
        comentariosRepository.deleteById(id);
    }
    
    //Actualizar Comentarios por id
    @RequestMapping(value = "/comentarios/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateComentariosById(@PathVariable Long id,@RequestBody @Validated Comentarios comentarios) {
        comentariosRepository.save(comentarios);
    }
}
