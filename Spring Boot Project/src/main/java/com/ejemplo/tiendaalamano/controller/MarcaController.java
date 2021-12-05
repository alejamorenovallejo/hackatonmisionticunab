package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.repository.MarcaRepository;
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
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class MarcaController {
    @Autowired
    private MarcaRepository marcaRepository;
    
    //Crear marca
    @RequestMapping(value = "/marca/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMarca(@RequestBody @Validated Marca marca) {
        marcaRepository.save(marca);
    }

    //Consultar todos los marcas
    @RequestMapping(value = "/marca/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Marca> getAllModels() {
        return marcaRepository.findAll();
    }
    
    //Consultar marca por id
    @RequestMapping(value = "/marca/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Marca> getMarcaById(@PathVariable Long id) {
        return marcaRepository.findById(id);
    }
    
    //Eliminar marca por id<<
    @RequestMapping(value = "marca/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteMarcasById(@PathVariable Long id) {
        marcaRepository.deleteById(id);
    }
    
    //Actualizar marca por id
    @RequestMapping(value = "/marca/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateCMarcaById(@PathVariable Long id,@RequestBody @Validated Marca marca) {
        marcaRepository.save(marca);
    }
}
