package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.RangoEntrega;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
public interface RangoEntregaService {
    public List<RangoEntrega> findAll();
    public RangoEntrega save(RangoEntrega RangoEntrega);
    public Optional<RangoEntrega> findById(Long id);
    public void deleteById(Long id);
}
