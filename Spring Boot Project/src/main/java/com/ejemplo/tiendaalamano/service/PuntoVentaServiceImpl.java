package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.PuntoVenta;
import com.ejemplo.tiendaalamano.repository.PuntoVentaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
@Service
public class PuntoVentaServiceImpl implements PuntoVentaService {

    @Autowired
    private PuntoVentaRepository puntoVentaRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<PuntoVenta> findAll() {
        return puntoVentaRepository.findAll();
    }
    
    @Override
    @Transactional
    public PuntoVenta save(PuntoVenta PuntoVenta) {
        return puntoVentaRepository.save(PuntoVenta);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<PuntoVenta> findById(Long id) {
        return puntoVentaRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        puntoVentaRepository.deleteById(id);
    }
    
}
