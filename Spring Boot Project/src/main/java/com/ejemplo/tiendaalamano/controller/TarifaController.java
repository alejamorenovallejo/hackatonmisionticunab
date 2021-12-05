package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Tarifa;
import com.ejemplo.tiendaalamano.repository.TarifaRepository;
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
public class TarifaController {
    @Autowired
    private TarifaRepository tarifaRepository;
    
   
    //Consultar todos las tarifas
    @RequestMapping(value = "/tarifa/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Tarifa> getAllTarifas() {
        return tarifaRepository.findAll();
    }
    
    //Crear tarifas
    @RequestMapping(value = "/tarifa/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPuntos(@RequestBody @Validated Tarifa tarifas) {
        tarifaRepository.save(tarifas);
    }

    //Consultar tarifas por id
    @RequestMapping(value = "/tarifa/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Tarifa> getPuntosById(@PathVariable Long id) {
        return tarifaRepository.findById(id);
    }
    
    //Eliminar tarifas por id
    @RequestMapping(value = "/tarifa/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePuntosById(@PathVariable Long id) {
        tarifaRepository.deleteById(id);
    }
    
    //Actualizar tarifas por id
    @RequestMapping(value = "/tarifa/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updatePuntosById(@PathVariable Long id,@RequestBody @Validated Tarifa tarifas) {
        tarifaRepository.save(tarifas);
    }
}
