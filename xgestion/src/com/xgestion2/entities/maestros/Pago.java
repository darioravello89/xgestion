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
@Table(name = "MA_PAGOS")
public class Pago implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pa_id")
    private Long id;
    
    @Column(name = "pa_nombre", nullable=false)
    private String nombre;

    @Column(name = "pa_descuento", nullable=false)
    private Integer descuento;
    
    @Column(name = "pa_activo")
    private Boolean activo = true;

    public Pago() {
    }

    public Pago(String nombre, Integer descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.activo=true;
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

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Pago{" + "id=" + id + ", nombre=" + nombre + ", descuento=" + descuento + ", activo=" + activo + '}';
    }

}
