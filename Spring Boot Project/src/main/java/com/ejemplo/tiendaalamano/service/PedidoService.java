package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Pedido;
import java.util.List;

/**
 *
 * @author Leandro Aguirre
 */
public interface PedidoService {
    public List<Pedido> findAll();
    public Pedido save(Pedido pedido);
    
}
