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
@Table(name = "producto")
public class Producto implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;
    
    @Column(length = 45, nullable=false)
    private String nombre;
    
    @Column(nullable=false)
    private float precio;
    
    @Column(nullable=false)
    private float impuesto;
    
    @Column(length = 45, nullable=false)
    private String inactivo;
    
    @Column(nullable=false)
    private int marcaIdMarca;
    
    @Column(nullable=false)
    private int categoriaIdCategoria;

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    public String getInactivo() {
        return inactivo;
    }

    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }

    public int getMarcaIdMarca() {
        return marcaIdMarca;
    }

    public void setMarcaIdMarca(int marcaIdMarca) {
        this.marcaIdMarca = marcaIdMarca;
    }

    public int getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(int categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }
    
    
    
    

    

}
