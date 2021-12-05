package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fefei
 */
@Entity
@Table(name = "tipocupon")
public class TipoCupon implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;

    public static List<TipoCupon> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipocupon;
    
    @Column(length = 45, nullable=false)
    private String tipo_cupon;
    
    public int getId_tipocupon() {
        return id_tipocupon;
    }

    public void setId_tipocupon(int id_tipocupon) {
        this.id_tipocupon = id_tipocupon;
    }

    public String getTipo_cupon() {
        return tipo_cupon;
    }

    public void setTipo_cupon(String tipo_cupon) {
        this.tipo_cupon = tipo_cupon;
    }
    
}
