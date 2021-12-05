/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID = -3904417485279370766L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Cliente;

    @Column(length = 45, nullable=false)
    private String nombre;
    
    @Column(nullable=false)
    private Long tipo_documento_id_tipo_Documento;
    
    @Column(length = 45, nullable=false)
    private String identificacion;
    
    @Column(length = 45, nullable=false)
    private String celular;
    
    @Column(length = 45, nullable=false)
    private String email;
    
    @Column(length = 45, nullable=false)
    private String direccion1;
    
    @Column(length = 45, nullable=false)
    private String direccion2;
    
    @Column(length = 45, nullable=false)
    private String direccion3;
    
    @Column(nullable=false)
    private Long puntos_acumulados;
    
    @Column(length = 45, nullable=false)
    private String inactivo;

    public Long getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Long id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTipo_documento_id_tipo_Documento() {
        return tipo_documento_id_tipo_Documento;
    }

    public void setTipo_documento_id_tipo_Documento(Long tipo_documento_id_tipo_Documento) {
        this.tipo_documento_id_tipo_Documento = tipo_documento_id_tipo_Documento;
    }

    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getDireccion3() {
        return direccion3;
    }

    public void setDireccion3(String direccion3) {
        this.direccion3 = direccion3;
    }

    public Long getPuntos_acumulados() {
        return puntos_acumulados;
    }

    public void setPuntos_acumulados(Long puntos_acumulados) {
        this.puntos_acumulados = puntos_acumulados;
    }

    public String getInactivo() {
        return inactivo;
    }

    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }
    
    
}
