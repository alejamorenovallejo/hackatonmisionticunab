package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.TipoDocumento;
import com.ejemplo.tiendaalamano.repository.TipoDocumentoRepository;
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
public class TipoDocumentoController {
        @Autowired
    private TipoDocumentoRepository TipoDocumentoRepository;
    
    @RequestMapping(value = "/tipodocumento/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TipoDocumento> getAllModels() {
        return TipoDocumento.finAll();
       }
}
