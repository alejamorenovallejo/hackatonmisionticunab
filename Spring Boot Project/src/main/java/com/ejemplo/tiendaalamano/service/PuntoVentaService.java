package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.PuntoVenta;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
public interface PuntoVentaService {
    public List<PuntoVenta> findAll();
    public PuntoVenta save(PuntoVenta PuntoVenta);
    public Optional<PuntoVenta> findById(Long id);
    public void deleteById(Long id);
}
