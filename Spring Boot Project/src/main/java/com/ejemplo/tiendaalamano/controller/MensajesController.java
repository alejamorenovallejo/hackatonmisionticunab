package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Mensajes;
import com.ejemplo.tiendaalamano.repository.MensajesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fefei
 */

@RestController
@RequestMapping("/api")
public class MensajesController {
        @Autowired
    private MensajesRepository MensajesRepository;
    
    @RequestMapping(value = "/mensajes/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Mensajes> getAllModels() {
        return Mensajes.finAll();
       }
}
