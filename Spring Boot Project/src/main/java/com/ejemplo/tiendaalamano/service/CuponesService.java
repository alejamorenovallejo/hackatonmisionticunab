package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Cupones;
import java.util.List;
import java.util.Optional;



public interface CuponesService {
	public List<Cupones> findAll();
	public Optional<Cupones> findById(Long id);
	public List<Cupones> login(String username, String password);
	public Cupones save(Cupones Cupones);
	public void deleteById(Long id);
	
}
