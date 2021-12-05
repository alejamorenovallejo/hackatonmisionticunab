package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.TipoCupon;
import com.ejemplo.tiendaalamano.repository.TipoCuponRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TipoCuponServiceImpl implements TipoCuponService {

    @Autowired
    private TipoCuponRepository tipoCuponRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<TipoCupon> findAll() {
        return tipoCuponRepository.findAll();
    }
    
}
