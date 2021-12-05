package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Mensajes;
import com.ejemplo.tiendaalamano.repository.MensajesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MensajesServiceImpl implements MensajesService {

    @Autowired
    private MensajesRepository MensajesRepository;
           
    @Override
    @Transactional(readOnly = true)
    public List<Mensajes> findAll() {
        return MensajesRepository.findAll();
    }

    @Override
    public Optional<Mensajes> findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mensajes> login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mensajes save(Mensajes Mensajes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
