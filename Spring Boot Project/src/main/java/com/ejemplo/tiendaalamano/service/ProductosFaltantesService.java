package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.ProductosFaltantes;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Leandro Aguirre
 */
public interface ProductosFaltantesService {
    public List<ProductosFaltantes> findAll();
    public ProductosFaltantes save(ProductosFaltantes productosFaltantes);
    public Optional<ProductosFaltantes> findById(Long id);
    public void deleteById(Long id);
}
