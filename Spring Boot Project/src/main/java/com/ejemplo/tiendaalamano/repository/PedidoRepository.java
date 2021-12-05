package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro Aguirre
 */
@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Long> {
    
}
