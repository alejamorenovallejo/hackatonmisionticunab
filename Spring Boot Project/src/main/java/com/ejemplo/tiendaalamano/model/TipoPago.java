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
@Table(name = "tipopago")
public class TipoPago implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;

    public static List<TipoPago> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipopago;
    
    @Column(length = 45, nullable=false)
    private String tipo_pago;
    
    public int getId_tipopago() {
        return id_tipopago;
    }

    public void setId_tipopago(int id_tipopago) {
        this.id_tipopago = id_tipopago;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }
    
}