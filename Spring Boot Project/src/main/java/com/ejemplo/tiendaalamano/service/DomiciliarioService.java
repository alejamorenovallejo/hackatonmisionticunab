package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import java.util.List;
import java.util.Optional;


public interface DomiciliarioService {
        public Domiciliario save(Domiciliario Domiciliario);	
        public List<Domiciliario> findAll();
        public Optional<Domiciliario> findById(Long id);
	public void deleteById(Long id);
	
}
