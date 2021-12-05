package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.RangoEntrega;
import com.ejemplo.tiendaalamano.repository.RangoEntregaRepository;
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
public class RangoEntregaServiceImpl implements RangoEntregaService {

    @Autowired
    private RangoEntregaRepository rangoentregaRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<RangoEntrega> findAll() {
        return rangoentregaRepository.findAll();
    }
    
     @Override
    @Transactional
    public RangoEntrega save(RangoEntrega RangoEntrega) {
        return rangoentregaRepository.save(RangoEntrega);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<RangoEntrega> findById(Long id) {
        return rangoentregaRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        rangoentregaRepository.deleteById(id);
    }
}
