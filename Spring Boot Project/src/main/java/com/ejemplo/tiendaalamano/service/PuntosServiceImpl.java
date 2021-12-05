package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Puntos;
import com.ejemplo.tiendaalamano.repository.PuntosRepository;
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
public class PuntosServiceImpl implements PuntosService {

    @Autowired
    private PuntosRepository puntosRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Puntos> findAll() {
        return puntosRepository.findAll();
    }

    @Override
    @Transactional
    public Puntos save(Puntos Puntos) {
        return puntosRepository.save(Puntos);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Puntos> findById(Long id) {
        return puntosRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        puntosRepository.deleteById(id);
    }
}
