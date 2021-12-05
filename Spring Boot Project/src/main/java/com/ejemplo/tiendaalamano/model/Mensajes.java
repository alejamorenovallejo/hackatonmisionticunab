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
@Table(name = "mensajes")
public class Mensajes implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;

    public static List<Mensajes> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mensajes;
    
    @Column(length = 45, nullable=false)
    private String mensajes;
    
    public int getId_mensajes() {
        return id_mensajes;
    }

    public void setId_mensajes(int id_mensajes) {
        this.id_mensajes = id_mensajes;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMesajes(String mensajes) {
        this.mensajes = mensajes;
    }
    
}
