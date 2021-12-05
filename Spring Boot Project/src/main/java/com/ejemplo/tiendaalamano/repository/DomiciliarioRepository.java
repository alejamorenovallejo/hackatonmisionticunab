package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Domiciliario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DomiciliarioRepository extends JpaRepository<Domiciliario, Long> {
	
}
