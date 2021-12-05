package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.PuntoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
@Repository
public interface PuntoVentaRepository extends JpaRepository<PuntoVenta, Long>{
    
}
