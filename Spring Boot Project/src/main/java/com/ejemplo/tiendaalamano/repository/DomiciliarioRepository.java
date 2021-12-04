package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.model.Domiciliario;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DomiciliarioRepository extends JpaRepository<Domiciliario, Long> {
	
}
