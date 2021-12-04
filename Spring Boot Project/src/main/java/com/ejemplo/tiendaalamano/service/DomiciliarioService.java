package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import java.util.List;
import java.util.Optional;


public interface DomiciliarioService {
	public List<Domiciliario> findAll();
	public Optional<Domiciliario> findById(Long id);
	public List<Domiciliario> login(String username, String password);
	public Domiciliario save(Domiciliario Domiciliario);
	public void deleteById(Long id);
	
}
