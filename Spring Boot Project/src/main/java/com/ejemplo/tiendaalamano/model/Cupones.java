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
	private int idCupones;
	
	@Column(length = 45, nullable=false)
	private String nombre;
	
	@Column(length = 45, nullable=false)
	private String Producto;
	
	@Column(length = 45, nullable=false)
	private String valor;
	
	@Column(length = 45, nullable=false)
	private String fechaCaducidad;
	
	@Column(length = 45, nullable=false)
	private String TipoCupon;

    public int getIdCupones() {
        return idCupones;
    }

    public void setIdCupones(int idCupones) {
        this.idCupones = idCupones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto_idProducto() {
        return Producto;
    }

    public void setProducto_idProducto(String Producto_idProducto) {
        this.Producto = Producto_idProducto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTipoCupon_idTipoCupon() {
        return TipoCupon;
    }

    public void setTipoCupon_idTipoCupon(String TipoCupon_idTipoCupon) {
        this.TipoCupon = TipoCupon_idTipoCupon;
    }
	

}
