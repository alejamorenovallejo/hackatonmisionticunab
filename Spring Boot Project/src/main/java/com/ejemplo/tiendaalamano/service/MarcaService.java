package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Marca;
import java.util.List;
import java.util.Optional;


public interface MarcaService {
	public List<Marca> findAll();
	public Optional<Marca> findById(Long id);
	public List<Marca> login(String username, String password);
	public Marca save(Marca Marca);
	public void deleteById(Long id);
	
}
