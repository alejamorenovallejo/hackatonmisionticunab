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
@Table(name = "productosfaltantes")
public class ProductosFaltantes implements Serializable {

    private static final long serialVersionUID = -5773962493781143007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProductosFaltantes;
    
    @Column(nullable=false)
    private int pedidoIdPedido;
    
    @Column(nullable=false)
    private int productoIdProducto;
    
    @Column(length = 255, nullable=false)
    private String mensaje;

    public long getIdProductosFaltantes() {
        return idProductosFaltantes;
    }

    public void setIdProductosFaltantes(long idProductosFaltantes) {
        this.idProductosFaltantes = idProductosFaltantes;
    }

    public int getPedidoIdPedido() {
        return pedidoIdPedido;
    }

    public void setPedidoIdPedido(int pedidoIdPedido) {
        this.pedidoIdPedido = pedidoIdPedido;
    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
