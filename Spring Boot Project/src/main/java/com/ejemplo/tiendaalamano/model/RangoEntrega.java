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
 * @author ALEJANDRA MORENO VALLEJO
 */
@Entity
@Table(name = "rangoentrega")
public class RangoEntrega implements Serializable{
    
    private static final long serialVersionUID = -5773962493781143007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rango_entrega;
    
    @Column(length = 45, nullable=false)
    private String rango_entrega;

    public long getId_rango_entrega() {
        return id_rango_entrega;
    }

    public void setId_rango_entrega(long id_rango_entrega) {
        this.id_rango_entrega = id_rango_entrega;
    }

    public String getRango_entrega() {
        return rango_entrega;
    }

    public void setRango_entrega(String rango_entrega) {
        this.rango_entrega = rango_entrega;
    }
  
}
