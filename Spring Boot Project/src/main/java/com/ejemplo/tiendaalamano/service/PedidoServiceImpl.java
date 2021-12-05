package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Leandro Aguirre
 */
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }
    
    @Override
    @Transactional
    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    
}
