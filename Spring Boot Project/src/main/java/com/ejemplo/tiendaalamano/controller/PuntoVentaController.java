package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.PuntoVenta;
import com.ejemplo.tiendaalamano.repository.PuntoVentaRepository;
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
public class PuntoVentaController {
    @Autowired
    private PuntoVentaRepository puntoventaRepository;
    
    @RequestMapping(value = "/puntoventa/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PuntoVenta> getAllModels() {
        return puntoventaRepository.findAll();
    }
}
