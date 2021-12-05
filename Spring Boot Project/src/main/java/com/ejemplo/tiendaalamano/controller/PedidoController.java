package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.repository.PedidoRepository;
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
public class PedidoController {
    
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @RequestMapping(value = "/pedido/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }
    
    @RequestMapping(value = "/pedido/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPedido(@RequestBody @Validated Pedido pedido) {
        pedidoRepository.save(pedido);
    }
}
