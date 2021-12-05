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
@Table(name="comentarios")
public class Comentarios implements Serializable{
    private static final long serialVersionUID = -3904417485279370766L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Comentarios;
        
    @Column(length = 45, nullable=false)
    private String comentario;

    @Column(length = 45, nullable=false)
    private Long producto_id_producto;

    public Long getId_Comentarios() {
        return id_Comentarios;
    }

    public void setId_Comentarios(Long id_Comentarios) {
        this.id_Comentarios = id_Comentarios;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Long getProducto_id_producto() {
        return producto_id_producto;
    }

    public void setProducto_id_producto(Long producto_id_producto) {
        this.producto_id_producto = producto_id_producto;
    }

    
}
