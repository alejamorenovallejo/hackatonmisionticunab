package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.EstadoPedido;
import java.util.List;
import java.util.Optional;


public interface EstadoPedidoService {
	public List<EstadoPedido> findAll();
	public Optional<EstadoPedido> findById(Long id);
	public List<EstadoPedido> login(String username, String password);
	public EstadoPedido save(EstadoPedido EstadoPedido);
	public void deleteById(Long id);
	
}
