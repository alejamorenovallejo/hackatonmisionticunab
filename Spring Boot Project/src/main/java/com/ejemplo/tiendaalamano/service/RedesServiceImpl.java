package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Redes;
import com.ejemplo.tiendaalamano.repository.RedesRepository;
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
public class RedesServiceImpl implements RedesService {

    @Autowired
    private RedesRepository redesRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<Redes> findAll() {
        return redesRepository.findAll();
    }
    
    @Override
    @Transactional
    public Redes save(Redes Redes) {
        return redesRepository.save(Redes);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Redes> findById(Long id) {
        return redesRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        redesRepository.deleteById(id);
    }
    
}
