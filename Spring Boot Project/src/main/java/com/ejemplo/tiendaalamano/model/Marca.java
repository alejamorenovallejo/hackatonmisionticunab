package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marca")
public class Marca implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMarca;
	
	@Column(length = 45, nullable=false)
	private String marca;
	
	@Column(length = 45, nullable=false)
	private String inactivo;

    public long getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(long idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getInactivo() {
        return inactivo;
    }

    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }
	
	
}

