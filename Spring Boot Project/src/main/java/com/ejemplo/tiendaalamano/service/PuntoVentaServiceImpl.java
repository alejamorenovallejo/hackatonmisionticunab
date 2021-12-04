package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.PuntoVenta;
import com.ejemplo.tiendaalamano.repository.PuntoVentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Leandro Aguirre
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
    
}
