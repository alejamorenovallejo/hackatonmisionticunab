package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.ProductosFaltantes;
import com.ejemplo.tiendaalamano.repository.ProductosFaltantesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

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

}
