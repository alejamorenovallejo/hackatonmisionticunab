/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Compra;
import com.ejemplo.tiendaalamano.repository.CompraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class CompraServiceImpl implements CompraService{
    @Autowired
    private CompraRepository compraRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Compra> findAll() {
        return compraRepository.findAll();
    }

    @Override
    @Transactional
    public Compra save(Compra Compra) {
        return compraRepository.save(Compra);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Compra> findById(Long id) {
        return compraRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        compraRepository.deleteById(id);
    }
}
