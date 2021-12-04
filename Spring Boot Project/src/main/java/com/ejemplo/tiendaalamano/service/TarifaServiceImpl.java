package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Tarifa;
import com.ejemplo.tiendaalamano.repository.TarifaRepository;
import java.util.List;
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
    
}
