package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.PagoCuota;
import com.ejemplo.tiendaalamano.repository.PagoCuotaRepository;
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
public class PagoCuotaServiceImpl implements PagoCuotaService {

    @Autowired
    private PagoCuotaRepository pagoCuotaRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<PagoCuota> findAll() {
        return pagoCuotaRepository.findAll();
    }
    
    @Override
    @Transactional
    public PagoCuota save(PagoCuota pagoCuota) {
        return pagoCuotaRepository.save(pagoCuota);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<PagoCuota> findById(Long id) {
        return pagoCuotaRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        pagoCuotaRepository.deleteById(id);
    }
    
}
