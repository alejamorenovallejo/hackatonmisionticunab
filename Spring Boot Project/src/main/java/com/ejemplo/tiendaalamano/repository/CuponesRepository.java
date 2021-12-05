package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Cupones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CuponesRepository extends JpaRepository<Cupones, Long> {
	
}
