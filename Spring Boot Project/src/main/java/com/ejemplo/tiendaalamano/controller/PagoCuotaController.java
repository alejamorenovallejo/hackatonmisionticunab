package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.PagoCuota;
import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.repository.PagoCuotaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @RequestMapping(value = "/pagocuota/crear", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPagoCuota(@RequestBody @Validated PagoCuota pagoCuota) {
        pagoCuotaRepository.save(pagoCuota);
    }

    //Consultar PagoCuota por id
    @RequestMapping(value = "/pagocuota/consultar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<PagoCuota> getPagoCuotaById(@PathVariable Long id) {
        return pagoCuotaRepository.findById(id);
    }
    
    //Eliminar PagoCuota por id
    @RequestMapping(value = "/pagocuota/eliminar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePagoCuotaById(@PathVariable Long id) {
        pagoCuotaRepository.deleteById(id);
    }
    
    //Actualizar PagoCuota por id
    @RequestMapping(value = "/pagocuota/actualizar/{id}", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updatePagoCuotaById(@PathVariable Long id,@RequestBody @Validated PagoCuota pagoCuota) {
        pagoCuotaRepository.save(pagoCuota);
    }
}
