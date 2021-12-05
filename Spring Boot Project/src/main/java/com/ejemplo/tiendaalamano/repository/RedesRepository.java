package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
@Repository
public interface RedesRepository extends JpaRepository<Redes, Long>{
    
}
