package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Puntos;
import java.util.List;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
public interface PuntosService {
    public List<Puntos> findAll();
    public Puntos save(Puntos Puntos);
    /*Puntos getPuntosById(Long id);*/

}
