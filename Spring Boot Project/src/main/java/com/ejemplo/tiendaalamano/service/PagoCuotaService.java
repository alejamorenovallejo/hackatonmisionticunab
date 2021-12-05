package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.PagoCuota;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Leandro Aguirre
 */
public interface PagoCuotaService {
    public List<PagoCuota> findAll();
    public PagoCuota save(PagoCuota pagoCuota);
    public Optional<PagoCuota> findById(Long id);
    public void deleteById(Long id);
}
