package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Marca;
import java.util.List;
import java.util.Optional;


public interface MarcaService {
	public Marca save(Marca Marca);
        public List<Marca> findAll();
	public Optional<Marca> findById(Long id);
	public void deleteById(Long id);
	
}
