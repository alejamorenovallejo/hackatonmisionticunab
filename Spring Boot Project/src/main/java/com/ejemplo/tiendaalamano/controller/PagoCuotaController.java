package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.PagoCuota;
import com.ejemplo.tiendaalamano.repository.PagoCuotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leandro Aguirre
 */

@RestController
@RequestMapping("/api")
public class PagoCuotaController {
    @Autowired
    private PagoCuotaRepository pagoCuotaRepository;
    
    @RequestMapping(value = "/pagocuota/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PagoCuota> getAllModels() {
        return pagoCuotaRepository.findAll();
    }
    
}
