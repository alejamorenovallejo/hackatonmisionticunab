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
@Table(name="compra")
public class Compra implements Serializable {
    private static final long serialVersionUID = -3904417485279370766L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Compra;
        
    @Column(nullable=false)
    private Long cliente_id_Cliente;
    
    @Column(nullable=false)
    private Long descuento;
    
    @Column(nullable=false)
    private Long impuesto;
    
    @Column(nullable=false)
    private Long totalCompra;
    
    @Column(length = 45, nullable=false)
    private String envio;
    
    @Column(nullable=false)
    private Integer puntos_compra;
    
    @Column(nullable=false)
    private Integer puntos_gastados;
    
    @Column(nullable=false)
    private Integer tipo_pago_id_tipo_pago;
    
    @Column(nullable=false)
    private Integer cantidad_Cuotas;
    
    @Column(length = 45, nullable=false)
    private String fecha_compra;

    public Long getId_Compra() {
        return id_Compra;
    }

    public void setId_Compra(Long id_Compra) {
        this.id_Compra = id_Compra;
    }

    

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }

    public Long getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Long impuesto) {
        this.impuesto = impuesto;
    }

    public Long getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Long totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getEnvio() {
        return envio;
    }

    public void setEnvio(String envio) {
        this.envio = envio;
    }

    public Integer getPuntos_compra() {
        return puntos_compra;
    }

    public void setPuntos_compra(Integer puntos_compra) {
        this.puntos_compra = puntos_compra;
    }

    public Integer getPuntos_gastados() {
        return puntos_gastados;
    }

    public void setPuntos_gastados(Integer puntos_gastados) {
        this.puntos_gastados = puntos_gastados;
    }

    public Long getCliente_id_Cliente() {
        return cliente_id_Cliente;
    }

    public void setCliente_id_Cliente(Long cliente_id_Cliente) {
        this.cliente_id_Cliente = cliente_id_Cliente;
    }

    public Integer getTipo_pago_id_tipo_pago() {
        return tipo_pago_id_tipo_pago;
    }

    public void setTipo_pago_id_tipo_pago(Integer tipo_pago_id_tipo_pago) {
        this.tipo_pago_id_tipo_pago = tipo_pago_id_tipo_pago;
    }

   

    public Integer getCantidad_Cuotas() {
        return cantidad_Cuotas;
    }

    public void setCantidad_Cuotas(Integer cantidad_Cuotas) {
        this.cantidad_Cuotas = cantidad_Cuotas;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
}
