package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Puntos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */

@Repository
public interface PuntosRepository extends JpaRepository<Puntos, Long>{
    
}
