package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Tarifa;
import com.ejemplo.tiendaalamano.repository.TarifaRepository;
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
public class TarifaServiceImpl implements TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<Tarifa> findAll() {
        return tarifaRepository.findAll();
    }
    
     @Override
    @Transactional
    public Tarifa save(Tarifa Tarifa) {
        return tarifaRepository.save(Tarifa);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Tarifa> findById(Long id) {
        return tarifaRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        tarifaRepository.deleteById(id);
    }
    
}
