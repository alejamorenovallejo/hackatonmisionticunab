package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.RangoEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
@Repository
public interface RangoEntregaRepository extends JpaRepository<RangoEntrega, Long>{
    
}
