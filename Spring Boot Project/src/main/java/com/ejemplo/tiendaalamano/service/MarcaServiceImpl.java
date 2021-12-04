package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService {
	@Autowired
	private MarcaRepository MarcaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Marca> findAll() {
		return MarcaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Marca> findById(Long id) {
		return MarcaRepository.findById(id);
	}

	@Override
	@Transactional
	public Marca save(Marca Marca) {
		return MarcaRepository.save(Marca);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		MarcaRepository.deleteById(id);
	}
/*
	@Override
	public List<Marca> login(String marca, String contraseña) {
		List<Marca> Marcas = UsuarioRepository.login(marca, contraseña);
		return Marcas;
	}
*/

    @Override
    public List<Marca> login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
