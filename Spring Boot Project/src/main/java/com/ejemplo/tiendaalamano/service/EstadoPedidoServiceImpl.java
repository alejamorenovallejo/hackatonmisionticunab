package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.EstadoPedido;
import com.ejemplo.tiendaalamano.repository.EstadoPedidoRepository;

@Service
public class EstadoPedidoServiceImpl implements EstadoPedidoService {
	@Autowired
	private EstadoPedidoRepository EstadoPedidoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<EstadoPedido> findAll() {
		return EstadoPedidoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<EstadoPedido> findById(Long id) {
		return EstadoPedidoRepository.findById(id);
	}

	@Override
	@Transactional
	public EstadoPedido save(EstadoPedido EstadoPedido) {
		return EstadoPedidoRepository.save(EstadoPedido);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		EstadoPedidoRepository.deleteById(id);
	}
/*
	@Override
	public List<EstadoPedido> login(String estadoPedido, String contraseña) {
		List<EstadoPedido> EstadoPedidos = UsuarioRepository.login(estadoPedido, contraseña);
		return EstadoPedidos;
	}
*/

    @Override
    public List<EstadoPedido> login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
