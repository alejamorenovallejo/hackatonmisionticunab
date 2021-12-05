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
@Table(name = "tipodocumento")
public class TipoDocumento implements Serializable{
    private static final long serialVersionUID = -5773962493781143007L;

    public static List<TipoDocumento> finAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipodocumento;
    
    @Column(length = 45, nullable=false)
    private String tipo_documento;
    
    public int getId_tipodocumento() {
        return id_tipodocumento;
    }

    public void setId_tipodocumento(int id_tipodocumento) {
        this.id_tipodocumento = id_tipodocumento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    
}
