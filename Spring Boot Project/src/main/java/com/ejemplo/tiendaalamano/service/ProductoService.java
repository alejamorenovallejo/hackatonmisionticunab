package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Leandro Aguirre
 */
public interface ProductoService {
    public List<Producto> findAll();
    public Producto save(Producto producto);
    public Optional<Producto> findById(Long id);
    public void deleteById(Long id);
}
