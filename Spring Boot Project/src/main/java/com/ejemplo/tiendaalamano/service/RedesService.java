package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Puntos;
import com.ejemplo.tiendaalamano.model.Redes;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
public interface RedesService {
    public List<Redes> findAll();
      public Redes save(Redes Redes);
    public Optional<Redes> findById(Long id);
    public void deleteById(Long id);
}
