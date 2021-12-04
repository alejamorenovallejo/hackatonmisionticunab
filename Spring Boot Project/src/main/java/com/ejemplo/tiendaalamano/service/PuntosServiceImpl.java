package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.exception.NoSuchResourceFoundException;
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
    
    /*@Override
    public Puntos getPuntosById(Long id) {
        Optional<Puntos> puntos = puntosRepository.findById(id);

        /*if (!puntos.isPresent()) {
            throw new NoSuchResourceFoundException("No model with given id found.");
        }*/

    /*    return puntos.get();
    }*/
    
}
