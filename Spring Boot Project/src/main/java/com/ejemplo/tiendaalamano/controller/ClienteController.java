/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Cliente;
import com.ejemplo.tiendaalamano.repository.ClienteRepository;
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


@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    
    //Traer todas ls clientes
    @RequestMapping(value = "/cliente/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getAllcliente() {
        return clienteRepository.findAll();
    }
    
    //Crear Cliente
    @RequestMapping(value = "/cliente/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCliente(@RequestBody @Validated Cliente cliente) {
        clienteRepository.save(cliente);
    }
    
    //Consultar cliente por id
    @RequestMapping(value = "/cliente/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cliente> getClienteById(@PathVariable Long id) {
        return clienteRepository.findById(id);
    }
    
    //Eliminar cliente por id
    @RequestMapping(value = "/cliente/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteClienteById(@PathVariable Long id) {
        clienteRepository.deleteById(id);
    }
    
    //Actualizar cliente por id
    @RequestMapping(value = "/cliente/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateClienteById(@PathVariable Long id,@RequestBody @Validated Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
