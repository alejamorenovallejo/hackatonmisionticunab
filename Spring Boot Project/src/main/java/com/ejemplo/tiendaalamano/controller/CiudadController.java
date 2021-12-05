/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Ciudad;
import com.ejemplo.tiendaalamano.repository.CiudadRepository;
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
public class CiudadController {
    @Autowired
    private CiudadRepository ciudadRepository;
    
    //Traer todas las ciudades
    @RequestMapping(value = "/ciudad/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Ciudad> getAllciudad() {
        return ciudadRepository.findAll();
    }
    
    //Crear Ciudad
    @RequestMapping(value = "/ciudad/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCiudad(@RequestBody @Validated Ciudad ciudad) {
        ciudadRepository.save(ciudad);
    }
    
    //Consultar ciudad por id
    @RequestMapping(value = "/ciudad/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Ciudad> getCiudadById(@PathVariable Long id) {
        return ciudadRepository.findById(id);
    }
    
    //Eliminar ciudad por id
    @RequestMapping(value = "/ciudad/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteCiudadById(@PathVariable Long id) {
        ciudadRepository.deleteById(id);
    }
    
    //Actualizar ciudad por id
    @RequestMapping(value = "/ciudad/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateCiudadById(@PathVariable Long id,@RequestBody @Validated Ciudad ciudad) {
        ciudadRepository.save(ciudad);
    }
}
