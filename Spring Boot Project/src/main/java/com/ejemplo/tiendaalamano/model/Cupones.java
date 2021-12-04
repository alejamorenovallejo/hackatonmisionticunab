package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cupones")
public class Cupones implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cupones;
	
	@Column(length = 45, nullable=false)
	private String nombre;
        
        @Column(length = 45, nullable=false)
	private String productoIdProducto;
	
	@Column(length = 45, nullable=false)
	private String valor;
        
        @Column(length = 45, nullable=false)
	private String tipoCuponIdTipoCupon;
	
	@Column(length = 45, nullable=false)
	private String fecha_caducidad;

    public int getId_cupones() {
        return id_cupones;
    }

    public void setId_cupones(int id_cupones) {
        this.id_cupones = id_cupones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(String productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipoCuponIdTipoCupon() {
        return tipoCuponIdTipoCupon;
    }

    public void setTipoCuponIdTipoCupon(String tipoCuponIdTipoCupon) {
        this.tipoCuponIdTipoCupon = tipoCuponIdTipoCupon;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

        
}