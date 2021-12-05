package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Pedido;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Leandro Aguirre
 */
public interface PedidoService {
    public List<Pedido> findAll();
    public Pedido save(Pedido pedido);
    public Optional<Pedido> findById(Long id);
    public void deleteById(Long id);
    
}
