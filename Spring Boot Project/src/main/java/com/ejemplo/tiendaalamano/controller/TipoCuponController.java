package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.TipoCupon;
import com.ejemplo.tiendaalamano.repository.TipoCuponRepository;
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
public class TipoCuponController {
        @Autowired
    private TipoCuponRepository TipoCuponRepository;
    
    @RequestMapping(value = "/tipocupon/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TipoCupon> getAllModels() {
        return TipoCupon.finAll();
       }
}