package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.ProductosFaltantes;
import com.ejemplo.tiendaalamano.repository.ProductosFaltantesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Leandro Aguirre
 */
public class ProductosFaltantesServiceImpl implements ProductosFaltantesService{

    @Autowired
    private ProductosFaltantesRepository productosFaltantesRepository;

    @Override
    public List<ProductosFaltantes> findAll() {
        return productosFaltantesRepository.findAll();
    }
    
    @Override
    @Transactional
    public ProductosFaltantes save(ProductosFaltantes productosFaltantes) {
        return productosFaltantesRepository.save(productosFaltantes);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ProductosFaltantes> findById(Long id) {
        return productosFaltantesRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        productosFaltantesRepository.deleteById(id);
    }

}
