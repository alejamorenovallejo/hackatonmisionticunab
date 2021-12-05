package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Redes;
import com.ejemplo.tiendaalamano.repository.RedesRepository;
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
 * @author ALEJANDRA MORENO VALLEJO
 */

@RestController
@RequestMapping("/api")
public class RedesController {
    @Autowired
    private RedesRepository redesRepository;
    
    //Consultar todos las redes
    @RequestMapping(value = "/redes/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Redes> getAllRedes() {
        return redesRepository.findAll();
    }
    
    //Crear Redes
    @RequestMapping(value = "/redes/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createRedes(@RequestBody @Validated Redes redes) {
        redesRepository.save(redes);
    }

    //Consultar redes por id
    @RequestMapping(value = "/redes/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Redes> getRedesById(@PathVariable Long id) {
        return redesRepository.findById(id);
    }
    
    //Eliminar reddes por id
    @RequestMapping(value = "/redes/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteRedesById(@PathVariable Long id) {
        redesRepository.deleteById(id);
    }
    
    //Actualizar redes por id
    @RequestMapping(value = "/redes/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateRedesById(@PathVariable Long id,@RequestBody @Validated Redes redes) {
        redesRepository.save(redes);
    }
}
