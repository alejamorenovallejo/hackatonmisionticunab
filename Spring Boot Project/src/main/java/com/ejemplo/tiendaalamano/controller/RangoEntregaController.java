package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.RangoEntrega;
import com.ejemplo.tiendaalamano.repository.RangoEntregaRepository;
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
public class RangoEntregaController {
    @Autowired
    private RangoEntregaRepository rangoentregaRepository;
    
    @RequestMapping(value = "/rangoentrega/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<RangoEntrega> getAllModels() {
        return rangoentregaRepository.findAll();
    }
}
