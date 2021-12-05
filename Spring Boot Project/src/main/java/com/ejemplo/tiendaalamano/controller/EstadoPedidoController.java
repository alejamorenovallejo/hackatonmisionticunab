package com.ejemplo.tiendaalamano.controller;


import com.ejemplo.tiendaalamano.model.EstadoPedido;
import com.ejemplo.tiendaalamano.repository.EstadoPedidoRepository;
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
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class EstadoPedidoController {
    @Autowired
    private EstadoPedidoRepository estadoPedidoRepository;
    
    //Crear estado pedido
    @RequestMapping(value = "/estadoPedido/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEstadoPedido(@RequestBody @Validated EstadoPedido estadoPedido) {
        estadoPedidoRepository.save(estadoPedido);
    }

    //Consultar todos los estados pedidos
    @RequestMapping(value = "/estadoPedido/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<EstadoPedido> getAllModels() {
        return estadoPedidoRepository.findAll();
    }
    
   //Consultar estado pedido por id
    @RequestMapping(value = "/estadoPedido/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<EstadoPedido> getEstadoPedidoById(@PathVariable Long id) {
        return estadoPedidoRepository.findById(id);
    }
    
    //Eliminar estado pedido por id<<
    @RequestMapping(value = "/estadoPedido/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteEstadoPedidoById(@PathVariable Long id) {
        estadoPedidoRepository.deleteById(id);
    }
    
    //Actualizar estado pedido por id
    @RequestMapping(value = "/estadoPedido/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateEstadoPedidoById(@PathVariable Long id,@RequestBody @Validated EstadoPedido estadoPedido) {
        estadoPedidoRepository.save(estadoPedido);
    }
}


