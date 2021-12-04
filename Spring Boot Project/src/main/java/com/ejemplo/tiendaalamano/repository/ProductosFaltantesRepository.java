package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.ProductosFaltantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro Aguirre
 */
@Repository
public interface ProductosFaltantesRepository extends JpaRepository<ProductosFaltantes, Long> {
    
}
