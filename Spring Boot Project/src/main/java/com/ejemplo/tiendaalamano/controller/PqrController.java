package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Pqr;
import com.ejemplo.tiendaalamano.model.Puntos;
import com.ejemplo.tiendaalamano.repository.PqrRepository;
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
public class PqrController {
    @Autowired
    private PqrRepository pqrRepository;
        
    @RequestMapping(value = "/pqr/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Pqr> getAllPqrs() {
        return pqrRepository.findAll();
    }
    
    @RequestMapping(value = "/pqr/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPqr(@RequestBody @Validated Pqr pqr) {
        pqrRepository.save(pqr);
    }
}
