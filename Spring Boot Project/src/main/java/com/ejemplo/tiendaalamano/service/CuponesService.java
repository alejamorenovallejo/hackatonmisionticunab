package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Cupones;
import java.util.List;
import java.util.Optional;



public interface CuponesService {
        public Cupones save(Cupones Cupones);	
        public List<Cupones> findAll();
        public Optional<Cupones> findById(Long id);
	public void deleteById(Long id);
	
}
