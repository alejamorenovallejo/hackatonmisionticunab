/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Ciudad;
import java.util.List;
import java.util.Optional;


public interface CiudadService {
    public List<Ciudad> findAll();
    public Ciudad save(Ciudad Ciudad);
    public Optional<Ciudad> findById(Long id);
    public void deleteById(Long id);
}
