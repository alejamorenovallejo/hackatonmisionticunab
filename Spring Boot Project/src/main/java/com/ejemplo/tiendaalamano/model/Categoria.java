/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID = -3904417485279370766L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Categoria;
    
    @Column(length = 45, nullable=false)
    private String categoria;
    
    @Column(length = 45, nullable=false)
    private String inactivo;

    //public Categoria(Long id_Categoria, String categoria, String inactivo) {
    //    this.id_Categoria = id_Categoria;
    //    this.categoria = categoria;
    //    this.inactivo = inactivo;
    //}

    public Long getIdCategoria() {
        return id_Categoria;
    }

    public void setIdCategoria(Long id_Categoria) {
        this.id_Categoria = id_Categoria;
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
