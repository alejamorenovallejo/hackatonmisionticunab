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
@Table(name = "redes")
public class Redes implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_redes;
    
    @Column(length = 45, nullable=false)
    private String nombre;

    @Column(length = 45, nullable=false)
    private String link;
   
    @Column(nullable=false)
    private int punto_venta_id_punto_venta;

    public long getId_redes() {
        return id_redes;
    }

    public void setId_redes(long id_redes) {
        this.id_redes = id_redes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getPunto_venta_id_punto_venta() {
        return punto_venta_id_punto_venta;
    }

    public void setPunto_venta_id_punto_venta(int punto_venta_id_punto_venta) {
        this.punto_venta_id_punto_venta = punto_venta_id_punto_venta;
    }
    
    
}

