package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Tarifa;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
public interface TarifaService {
    public List<Tarifa> findAll();
     public Tarifa save(Tarifa Tarifa);
    public Optional<Tarifa> findById(Long id);
    public void deleteById(Long id);
}
