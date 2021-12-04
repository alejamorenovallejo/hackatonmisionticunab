package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import com.ejemplo.tiendaalamano.repository.DomiciliarioRepository;

@Service
public class DomiciliarioServiceImpl implements DomiciliarioService {
	@Autowired
	private DomiciliarioRepository DomiciliarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Domiciliario> findAll() {
		return DomiciliarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Domiciliario> findById(Long id) {
		return DomiciliarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Domiciliario save(Domiciliario Domiciliario) {
		return DomiciliarioRepository.save(Domiciliario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		DomiciliarioRepository.deleteById(id);
	}
/*
	@Override
	public List<Domiciliario> login(String domiciliario, String contraseña) {
		List<Domiciliario> Domiciliarios = DomiciliarioRepository.login(domiciliario, contraseña);
		return Domiciliarios;
	}
*/

    @Override
    public List<Domiciliario> login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
