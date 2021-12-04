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
@Table(name = "pagocuota")
public class PagoCuota implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagoCuota;
    
    @Column(nullable=false)
    private float saldo;

    @Column(nullable=false)
    private int cliente_idCliente;

    public int getIdPagoCuota() {
        return idPagoCuota;
    }

    public void setIdPagoCuota(int idPagoCuota) {
        this.idPagoCuota = idPagoCuota;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getCliente_idCliente() {
        return cliente_idCliente;
    }

    public void setCliente_idCliente(int cliente_idCliente) {
        this.cliente_idCliente = cliente_idCliente;
    }
    
    

    
}
