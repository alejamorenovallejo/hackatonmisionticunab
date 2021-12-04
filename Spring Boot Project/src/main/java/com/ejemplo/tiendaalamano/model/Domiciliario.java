package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domiciliario")
public class Domiciliario implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDomiciliario;
	
	@Column(length = 45, nullable=false)
	private String tipoDocumentoIdTipoDocumento;
	
	@Column(length = 45, nullable=false)
	private String identificacion;
	
	@Column(length = 45, nullable=false)
	private String nombre;
	
	@Column(length = 45, nullable=false)
	private String celular;
	
	@Column(length = 45, nullable=false)
	private String email;
	
	@Column(length = 45, nullable=false)
	private String inactivo;

    public int getIdDomiciliario() {
        return idDomiciliario;
    }

    public void setIdDomiciliario(int idDomiciliario) {
        this.idDomiciliario = idDomiciliario;
    }

    public String getTipoDocumentoIdTipoDcoumento() {
        return tipoDocumentoIdTipoDocumento;
    }

    public void setTipoDocumentoIdTipoDcoumento(String tipoDocumentoIdTipoDcoumento) {
        this.tipoDocumentoIdTipoDocumento = tipoDocumentoIdTipoDcoumento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInactivo() {
        return inactivo;
    }

    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }


        
}
