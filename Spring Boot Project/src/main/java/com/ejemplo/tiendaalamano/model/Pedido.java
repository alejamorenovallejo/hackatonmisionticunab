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
 * @author Leandro Aguirre
 */
@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = -5773962493781143007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @Column(nullable = false)
    private int compraIdCompra;

    @Column(nullable = false)
    private int estadoPedidoIdEstadoPedido;

    @Column(length = 200, nullable = false)
    private String lugarEntrega;

    @Column(nullable = false)
    private int puntoVentaIdPuntoVenta;

    @Column(length = 45, nullable = false)
    private String fechaEntrega;

    @Column(nullable = false)
    private int rangoEntregaIdRangoEntrega;

    @Column(length = 45, nullable = false)
    private String calificacion;

    @Column(length = 255, nullable = false)
    private String observacion;

    @Column(nullable = false)
    private int domiciliarioIdDomiciliario;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCompraIdCompra() {
        return compraIdCompra;
    }

    public void setCompraIdCompra(int compraIdCompra) {
        this.compraIdCompra = compraIdCompra;
    }

    public int getEstadoPedidoIdEstadoPedido() {
        return estadoPedidoIdEstadoPedido;
    }

    public void setEstadoPedidoIdEstadoPedido(int estadoPedidoIdEstadoPedido) {
        this.estadoPedidoIdEstadoPedido = estadoPedidoIdEstadoPedido;
    }

    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public int getPuntoVentaIdPuntoVenta() {
        return puntoVentaIdPuntoVenta;
    }

    public void setPuntoVentaIdPuntoVenta(int puntoVentaIdPuntoVenta) {
        this.puntoVentaIdPuntoVenta = puntoVentaIdPuntoVenta;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getRangoEntregaIdRangoEntrega() {
        return rangoEntregaIdRangoEntrega;
    }

    public void setRangoEntregaIdRangoEntrega(int rangoEntregaIdRangoEntrega) {
        this.rangoEntregaIdRangoEntrega = rangoEntregaIdRangoEntrega;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getDomiciliarioIdDomiciliario() {
        return domiciliarioIdDomiciliario;
    }

    public void setDomiciliarioIdDomiciliario(int domiciliarioIdDomiciliario) {
        this.domiciliarioIdDomiciliario = domiciliarioIdDomiciliario;
    }
    
}
