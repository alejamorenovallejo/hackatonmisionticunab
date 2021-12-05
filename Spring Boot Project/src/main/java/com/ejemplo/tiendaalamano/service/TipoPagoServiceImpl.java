package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.TipoPago;
import com.ejemplo.tiendaalamano.repository.TipoPagoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TipoPagoServiceImpl implements TipoPagoService {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<TipoPago> findAll() {
        return tipoPagoRepository.findAll();
    }
    
}
