package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.EstadoPedido;
import java.util.List;
import java.util.Optional;


public interface EstadoPedidoService {
        public EstadoPedido save(EstadoPedido EstadoPedido);
	public List<EstadoPedido> findAll();
        public Optional<EstadoPedido> findById(Long id);
	public void deleteById(Long id);
	
}
