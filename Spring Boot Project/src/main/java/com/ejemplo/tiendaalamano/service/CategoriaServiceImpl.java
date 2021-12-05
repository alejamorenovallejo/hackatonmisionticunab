/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.exception.BadResourceRequestException;
import com.ejemplo.tiendaalamano.exception.NoSuchResourceFoundException;
import com.ejemplo.tiendaalamano.model.Categoria;
import com.ejemplo.tiendaalamano.repository.CategoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaRepository categoriaRepository;

    /*@Override
    @Transactional(readOnly = true)
    public void deleteAllCategorias() {
        categoriaRepository.deleteAllInBatch();
    }*/

    @Override
    @Transactional
    public void deleteById(Long id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Categoria> findById(Long id) {
        /* Optional<Categoria> categoria = categoriaRepository.findById(id);

        if (!categoria.isPresent()) {
            throw new NoSuchResourceFoundException("No categoria with given id found.");
        }

        return categoria;*/
        return categoriaRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }
    
}
