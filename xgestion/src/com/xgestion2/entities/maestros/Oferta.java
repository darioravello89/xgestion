/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.maestros;

import java.io.Serializable;
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
@Table(name = "MA_OFERTAS")
public class Oferta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "of_id")
    private Long id;
    
    @Column(name = "of_nombre")
    private String nombre;
    
    @Column(name = "of_desde")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date desde;
    
    @Column(name = "of_hasta")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date hasta;
    
    //1 = codigo , 2 = familia, 3 = subdamilia, 4 = ubicacion
    @Column(name = "of_tipo")
    private Integer tipo;
    
    @Column(name = "of_objeto")
    private Long objeto;
    
    @Column(name = "of_descuento")
    private Integer descuento;
    
    @Column(name = "of_activo")
    private Boolean activo = true;

    public Oferta() {
    }

    public Oferta(String nombre, Date desde, Date hasta, Integer tipo, Long objeto, Integer descuento) {
        this.nombre = nombre;
        this.desde = desde;
        this.hasta = hasta;
        this.tipo = tipo;
        this.objeto = objeto;
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

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Long getObjeto() {
        return objeto;
    }

    public void setObjeto(Long objeto) {
        this.objeto = objeto;
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
        return "Oferta{" + "id=" + id + ", nombre=" + nombre + ", desde=" + desde + ", hasta=" + hasta + ", tipo=" + tipo + ", objeto=" + objeto + ", descuento=" + descuento + ", activo=" + activo + '}';
    }

}
