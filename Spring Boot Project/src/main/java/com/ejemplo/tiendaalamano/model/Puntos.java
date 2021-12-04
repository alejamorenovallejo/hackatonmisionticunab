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
@Table(name = "puntos")
public class Puntos implements Serializable{
    
    @Id
    private int id_puntos;
    
    @Column(nullable=false)
    private float valor;

    public int getId_puntos() {
        return id_puntos;
    }

    public void setId_puntos(int id_puntos) {
        this.id_puntos = id_puntos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
