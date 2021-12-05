/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Comentarios;
import com.ejemplo.tiendaalamano.repository.ComentariosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class ComentariosServiceImpl implements ComentariosService{
    
    @Autowired
    private ComentariosRepository comentariosRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Comentarios> findAll() {
        return comentariosRepository.findAll();
    }

    @Override
    @Transactional
    public Comentarios save(Comentarios comentarios) {
        return comentariosRepository.save(comentarios);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Comentarios> findById(Long id) {
        return comentariosRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        comentariosRepository.deleteById(id);
    }
}
