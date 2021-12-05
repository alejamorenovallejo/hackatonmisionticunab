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
@Table(name="ciudad")
public class Ciudad implements Serializable{
    private static final long serialVersionUID = -3904417485279370766L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Ciudad;

    @Column(length = 45, nullable=false)
    private String ciudad;

    /*public Ciudad(Long idCiudad, String ciudad) {
        this.idCiudad = idCiudad;
        this.ciudad = ciudad;
    }*/

    public Long getIdCiudad() {
        return id_Ciudad;
    }

    public void setIdCiudad(Long id_Ciudad) {
        this.id_Ciudad = id_Ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
