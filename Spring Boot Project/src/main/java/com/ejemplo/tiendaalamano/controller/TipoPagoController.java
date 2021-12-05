package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.TipoPago;
import com.ejemplo.tiendaalamano.repository.TipoPagoRepository;
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
public class TipoPagoController {
        @Autowired
    private TipoPagoRepository TipoPagoRepository;
    
    @RequestMapping(value = "/tipopago/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TipoPago> getAllModels() {
        return TipoPago.finAll();
       }
}
