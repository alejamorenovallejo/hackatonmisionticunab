/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Cliente;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
    public List<Cliente> findAll();
    public Cliente save(Cliente Cliente);
    public Optional<Cliente> findById(Long id);
    public void deleteById(Long id);
}
