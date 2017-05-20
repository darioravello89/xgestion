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
@Table(name = "MA_MOVIMIENTOS_CODIGOS")
public class MovimientoCodigo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mc_id")
    private Long id;
    
    @Column(name = "mc_nombre")
    private String nombre;

    @Column(name = "mt_positivo")
    private Boolean positivo;

    @Column(name = "mc_activo")
    private Boolean activo = true;

    public MovimientoCodigo() {
        this.positivo = true;
    }

    public MovimientoCodigo(String nombre, Boolean positivo) {
        this.positivo = positivo;
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
    
    public Boolean getPositivo() {
        return positivo;
    }

    public void setPositivo(Boolean positivo) {
        this.positivo = positivo;
    }

    @Override
    public String toString() {
        return "MovimientoCodigo{" + "id=" + id + ", nombre=" + nombre + ", positivo=" + positivo + ", activo=" + activo + '}';
    }
        
}
