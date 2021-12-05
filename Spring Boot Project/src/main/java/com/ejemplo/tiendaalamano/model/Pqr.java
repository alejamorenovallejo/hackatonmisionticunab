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
@Table(name = "pqr")
public class Pqr implements Serializable {

    private static final long serialVersionUID = -5773962493781143007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPqr;

    @Column(length = 45, nullable = false)
    private String Pedido_idPedido;

    @Column(length = 255, nullable = false)
    private String mensaje;

    public long getIdPqr() {
        return idPqr;
    }

    public void setIdPqr(long idPqr) {
        this.idPqr = idPqr;
    }

    public String getPedido_idPedido() {
        return Pedido_idPedido;
    }

    public void setPedido_idPedido(String Pedido_idPedido) {
        this.Pedido_idPedido = Pedido_idPedido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    

}
