package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Redes;
import com.ejemplo.tiendaalamano.repository.RedesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    
    @RequestMapping(value = "/redes/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Redes> getAllModels() {
        return redesRepository.findAll();
    }
}
