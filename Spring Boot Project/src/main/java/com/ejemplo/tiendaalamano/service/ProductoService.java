package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Producto;
import java.util.List;

/**
 *
 * @author Leandro Aguirre
 */
public interface ProductoService {
    public List<Producto> findAll();
}
