/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Categoria;
import java.util.List;
import java.util.Optional;


public interface CategoriaService {
    //void deleteAllCategorias();
    //void deleteCategoriaById(Long id);
    public List<Categoria> findAll();
    public Categoria save(Categoria Categoria);
    public Optional<Categoria> findById(Long id);
    public void deleteById(Long id);
    //List<Categoria> getAllCategorias();
}
