/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ALEJANDRA MORENO VALLEJO
 */
@Entity
@Table(name = "rangoentrega")
public class RangoEntrega implements Serializable{
    
    @Id
    private int id_rango_entrega;
    
    @Column(length = 45, nullable=false)
    private String rango_entrega;

    public int getId_rango_entrega() {
        return id_rango_entrega;
    }

    public void setId_rango_entrega(int id_rango_entrega) {
        this.id_rango_entrega = id_rango_entrega;
    }

    public String getRango_entrega() {
        return rango_entrega;
    }

    public void setRango_entrega(String rango_entrega) {
        this.rango_entrega = rango_entrega;
    }
  
}
