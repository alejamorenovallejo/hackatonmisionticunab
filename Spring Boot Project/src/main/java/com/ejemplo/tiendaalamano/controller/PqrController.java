package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Pqr;
import com.ejemplo.tiendaalamano.repository.PqrRepository;
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

    //Consultar pqr por id
    @RequestMapping(value = "/pqr/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Pqr> getPedidoById(@PathVariable Long id) {
        return pqrRepository.findById(id);
    }
    
    //Eliminar pqr por id
    @RequestMapping(value = "/pqr/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePedidoById(@PathVariable Long id) {
        pqrRepository.deleteById(id);
    }
    
    //Actualizar pqr por id
    @RequestMapping(value = "/pqr/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updatePedidoById(@PathVariable Long id,@RequestBody @Validated Pqr pqr) {
        pqrRepository.save(pqr);
    }
}
