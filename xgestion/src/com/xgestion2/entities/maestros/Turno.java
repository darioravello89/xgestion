/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.maestros;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author dario
 */
@Entity
@Table(name = "MA_TURNOS")
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tu_id")
    private Long id;
    
    @Column(name = "tu_nombre")
    private String nombre="SIN TURNO";
    
    @Column(name = "tu_desde")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date desde;
    
    @Column(name = "tu_hasta")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hasta;
       
    @Column(name = "tu_activo")
    private Boolean activo = true;

    public Turno() {
    }

    public Turno(String nombre, Time desde, Time hasta) {
        this.nombre = nombre;
        this.desde = desde;
        this.hasta = hasta;
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

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Turno{" + "id=" + id + ", nombre=" + nombre + ", desde=" + desde + ", hasta=" + hasta + ", activo=" + activo + '}';
    }

}
