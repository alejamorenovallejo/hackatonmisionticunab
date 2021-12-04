package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.PagoCuota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro Aguirre
 */
@Repository
public interface PagoCuotaRepository extends JpaRepository<PagoCuota, Long>{
    
}
