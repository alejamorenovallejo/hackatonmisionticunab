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
@Table(name = "tarifa")
public class Tarifa implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tarifa;
    
    @Column(nullable=false)
    private int cantidad;

    @Column(nullable=false)
    private float precio;
    
    @Column(nullable=false)
    private float tarifa;

    public long getId_tarifa() {
        return id_tarifa;
    }

    public void setId_tarifa(long id_tarifa) {
        this.id_tarifa = id_tarifa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
}
