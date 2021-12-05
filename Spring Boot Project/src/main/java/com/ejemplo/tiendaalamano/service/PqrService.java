package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Pqr;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Leandro Aguirre
 */
public interface PqrService {
    public List<Pqr> findAll();
    public Pqr save(Pqr pqr);
    public Optional<Pqr> findById(Long id);
    public void deleteById(Long id);
}
