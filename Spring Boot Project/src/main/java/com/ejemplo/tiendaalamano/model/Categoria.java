/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import javax.persistence.Id;

/**
 *
 * @author Macanita
 */
public class Categoria {
    private static final long serialVersionUID = -3904417485279370766L;

	@Id
    private Long idCategoria;

    private String categoria;
    
    private String inactivo;

    public Categoria(Long idCategoria, String categoria, String inactivo) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
        this.inactivo = inactivo;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getInactivo() {
        return inactivo;
    }

    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }
    
}
