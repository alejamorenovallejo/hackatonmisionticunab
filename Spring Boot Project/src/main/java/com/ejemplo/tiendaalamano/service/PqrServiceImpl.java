package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.model.Pqr;
import com.ejemplo.tiendaalamano.repository.PqrRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Leandro Aguirre
 */
@Service
public class PqrServiceImpl implements PqrService {

    @Autowired
    private PqrRepository pqrRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Pqr> findAll() {
        return pqrRepository.findAll();
    }
    
    @Override
    @Transactional
    public Pqr save(Pqr pqr) {
        return pqrRepository.save(pqr);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pqr> findById(Long id) {
        return pqrRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        pqrRepository.deleteById(id);
    }
}
