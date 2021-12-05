/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Compra;
import java.util.List;
import java.util.Optional;


public interface CompraService {
    public List<Compra> findAll();
    public Compra save(Compra Compra);
    public Optional<Compra> findById(Long id);
    public void deleteById(Long id);
}
