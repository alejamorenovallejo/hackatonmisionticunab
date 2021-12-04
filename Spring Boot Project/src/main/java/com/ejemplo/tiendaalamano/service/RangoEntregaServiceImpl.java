package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.RangoEntrega;
import com.ejemplo.tiendaalamano.repository.RangoEntregaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
@Service
public class RangoEntregaServiceImpl implements RangoEntregaService {

    @Autowired
    private RangoEntregaRepository rangoentregaRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<RangoEntrega> findAll() {
        return rangoentregaRepository.findAll();
    }
    
}
