package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.PuntoVenta;
import com.ejemplo.tiendaalamano.repository.PuntoVentaRepository;
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
public class PuntoVentaController {
    @Autowired
    private PuntoVentaRepository puntoventaRepository;
    
    //Consultar todos los puntos de venta
    @RequestMapping(value = "/puntoventa/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PuntoVenta> getAllPuntoVenta() {
        return puntoventaRepository.findAll();
    }
    
    //Crear Puntos de venta
    @RequestMapping(value = "/puntoventa/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPuntoVenta(@RequestBody @Validated PuntoVenta PuntoVenta) {
        puntoventaRepository.save(PuntoVenta);
    }

    //Consultar puntos de venta por id
    @RequestMapping(value = "/puntoventa/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<PuntoVenta> getPuntoVentaById(@PathVariable Long id) {
        return puntoventaRepository.findById(id);
    }
    
    //Eliminar puntos de venta por id
    @RequestMapping(value = "/puntoventa/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePuntoVentaById(@PathVariable Long id) {
        puntoventaRepository.deleteById(id);
    }
    
    //Actualizar puntos de venta por id
    @RequestMapping(value = "/puntoventa/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updatePuntoVentaById(@PathVariable Long id,@RequestBody @Validated PuntoVenta puntoventa) {
        puntoventaRepository.save(puntoventa);
    }
}
