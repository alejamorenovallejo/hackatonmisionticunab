package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Puntos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
public interface PuntosService {
    public List<Puntos> findAll();
    public Puntos save(Puntos Puntos);
    public Optional<Puntos> findById(Long id);
    public void deleteById(Long id);

}
