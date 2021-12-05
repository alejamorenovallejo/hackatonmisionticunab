/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Comentarios;
import java.util.List;
import java.util.Optional;


public interface ComentariosService {
    public List<Comentarios> findAll();
    public Comentarios save(Comentarios Comentarios);
    public Optional<Comentarios> findById(Long id);
    public void deleteById(Long id);
}
