/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import com.xgestion2.entities.maestros.MovimientoCodigo;
import com.xgestion2.entities.maestros.MovimientoTipo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dario
 */

@Entity
@Table(name = "IN_MOVIMIENTOS")
public class Movimiento implements Serializable {
    
    @EmbeddedId
    private ClaveCompuestaTx id;
        
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_mov_tipo")
    private MovimientoTipo tipo;  
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_mov_codigo")
    private MovimientoCodigo codigo;  
    
    @Column(name = "mov_detalle")
    private String notas;
      
    @Column(name = "mov_registro")
    private Double registro;
    
    @Column(name = "mov_egreso")
    private Double egreso;
    
    @Column(name = "activo")
    private Boolean activo;

    public Movimiento() {
    }

    public Movimiento(ClaveCompuestaTx id, MovimientoTipo tipo, MovimientoCodigo codigo, String notas, Double registro, Double egreso, Boolean activo) {
        this.id = id;
        this.tipo = tipo;
        this.codigo = codigo;
        this.notas = notas;
        this.registro = registro;
        this.egreso = egreso;
        this.activo = activo;
    }

    public ClaveCompuestaTx getId() {
        return id;
    }

    public void setId(ClaveCompuestaTx id) {
        this.id = id;
    }

    public MovimientoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimientoTipo tipo) {
        this.tipo = tipo;
    }

    public MovimientoCodigo getCodigo() {
        return codigo;
    }

    public void setCodigo(MovimientoCodigo codigo) {
        this.codigo = codigo;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Double getRegistro() {
        return registro;
    }

    public void setRegistro(Double registro) {
        this.registro = registro;
    }

    public Double getEgreso() {
        return egreso;
    }

    public void setEgreso(Double egreso) {
        this.egreso = egreso;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "id=" + id + ", tipo=" + tipo + ", codigo=" + codigo + ", notas=" + notas + ", registro=" + registro + ", egreso=" + egreso + ", activo=" + activo + '}';
    }
   
}
