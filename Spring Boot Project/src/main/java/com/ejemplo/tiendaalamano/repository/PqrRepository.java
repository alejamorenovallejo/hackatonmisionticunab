package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Pqr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro Aguirre
 */
@Repository
public interface PqrRepository extends JpaRepository<Pqr, Long> {
    
}
