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
@Table(name = "puntoventa")
public class PuntoVenta implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_puntoventa;
    
    @Column(length = 45, nullable=false)
    private String punto_venta;
    
    @Column(length = 45, nullable=false)
    private String direccion;
    
    @Column(length = 45, nullable=false)
    private String longitud;
    
    @Column(length = 45, nullable=false)
    private String latitud;
    
    @Column(nullable=false)
    private int ciudad_id_ciudad;

    public long getId_puntoventa() {
        return id_puntoventa;
    }

    public void setId_puntoventa(long id_puntoventa) {
        this.id_puntoventa = id_puntoventa;
    }

    public String getPunto_venta() {
        return punto_venta;
    }

    public void setPunto_venta(String punto_venta) {
        this.punto_venta = punto_venta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public int getCiudad_id_ciudad() {
        return ciudad_id_ciudad;
    }

    public void setCiudad_id_ciudad(int ciudad_id_ciudad) {
        this.ciudad_id_ciudad = ciudad_id_ciudad;
    }
}
