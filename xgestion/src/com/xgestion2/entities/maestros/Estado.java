/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.maestros;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dario
 */
@Entity
@Table(name = "MA_ESTADOS")
public class Estado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "es_id")
    private Long id;
    
    @Column(name = "es_nombre")
    private String nombre;

    @Column(name = "es_activo")
    private Boolean activo = true;

    public Estado() {
    }

    public Estado(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", nombre=" + nombre + ", activo=" + activo + '}';
    }
    
}
