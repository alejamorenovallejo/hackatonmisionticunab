package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Pqr;
import java.util.List;

/**
 *
 * @author Leandro Aguirre
 */
public interface PqrService {
    public List<Pqr> findAll();
    public Pqr save(Pqr pqr);
}
