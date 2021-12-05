/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Ciudad;
import com.ejemplo.tiendaalamano.repository.CiudadRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class CiudadServiceImpl implements CiudadService{
    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    @Override
    @Transactional
    public Ciudad save(Ciudad Ciudad) {
        return ciudadRepository.save(Ciudad);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Ciudad> findById(Long id) {
        return ciudadRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        ciudadRepository.deleteById(id);
    }
}
