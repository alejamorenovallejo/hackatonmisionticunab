package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.repository.PedidoRepository;
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
public class PedidoController {
    
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    //Consultar todos los pedidos
    @RequestMapping(value = "/pedido/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }
    
    //Crear Pedidos
    @RequestMapping(value = "/pedido/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPedido(@RequestBody @Validated Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    //Consultar puntos por id
    @RequestMapping(value = "/pedido/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Pedido> getPedidoById(@PathVariable Long id) {
        return pedidoRepository.findById(id);
    }
    
    //Eliminar puntos por id
    @RequestMapping(value = "/pedido/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePedidoById(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }
    
    //Actualizar puntos por id
    @RequestMapping(value = "/pedido/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updatePedidoById(@PathVariable Long id,@RequestBody @Validated Pedido pedido) {
        pedidoRepository.save(pedido);
    }
}
