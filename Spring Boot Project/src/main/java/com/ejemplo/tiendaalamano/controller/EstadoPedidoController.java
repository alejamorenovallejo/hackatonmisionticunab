package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.EstadoPedido;
import com.ejemplo.tiendaalamano.service.EstadoPedidoService;
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
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class EstadoPedidoController {
    @Autowired
    private EstadoPedidoService estadoPedidoService;
    
    @RequestMapping(value = "/estadoPedido", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEstadoPedido(@RequestBody @Validated EstadoPedido estadoPedido) {
        estadoPedidoService.save(estadoPedido);
    }

    @RequestMapping(value = "/estadoPedido/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<EstadoPedido> getAllModels() {
        return estadoPedidoService.findAll();
    }
    
}
