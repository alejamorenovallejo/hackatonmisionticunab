package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Long>{
    
}
