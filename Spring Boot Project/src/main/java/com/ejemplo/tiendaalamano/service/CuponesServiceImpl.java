package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Cupones;
import com.ejemplo.tiendaalamano.repository.CuponesRepository;

@Service
public class CuponesServiceImpl implements CuponesService {
	@Autowired
	private CuponesRepository CuponesRepository;

	@Override
	@Transactional
	public Cupones save(Cupones Cupones) {
		return CuponesRepository.save(Cupones);
	}
        
        @Override
	@Transactional(readOnly = true)
	public List<Cupones> findAll() {
		return CuponesRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cupones> findById(Long id) {
		return CuponesRepository.findById(id);
	}


	@Override
	@Transactional
	public void deleteById(Long id) {
		CuponesRepository.deleteById(id);
	}
/*
	@Override
	public List<Cupones> login(String cupones, String contraseña) {
		List<Domiciliario> Domiciliarios = DomiciliarioRepository.login(domiciliario, contraseña);
		return Domiciliarios;
	}
*/
}