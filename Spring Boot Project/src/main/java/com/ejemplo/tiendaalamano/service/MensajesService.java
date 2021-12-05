package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Mensajes;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author fefei
 */
public interface MensajesService {

    public List<Mensajes> findAll();

    public Optional<Mensajes> findById(Long id);

    public List<Mensajes> login(String username, String password);

    public Mensajes save(Mensajes Mensajes);

    public void deleteById(Long id);

}
