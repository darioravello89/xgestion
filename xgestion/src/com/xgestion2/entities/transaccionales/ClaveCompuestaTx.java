/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import xgestion.FormPrincipal;

/**
 *
 * @author dario
 */
@Embeddable
public class ClaveCompuestaTx implements Serializable{

    @Column(name = "pk_fecha")
    private Date fechaHora;

    @Column(name = "pk_sucursal")
    private Long sucursal;
    
    @Column(name = "pk_computadora")
    private Long computadora;
    
    @Column(name = "pk_usuario")
    private Long usuario;

    public ClaveCompuestaTx() {
        fechaHora = new Date();
        sucursal = FormPrincipal.miSucursal.getId();
        computadora = FormPrincipal.miComputadora.getId();
        usuario = FormPrincipal.miUsuario.getId();
    }

    public ClaveCompuestaTx(Date fechaHora, Long sucursal, Long computadora, Long usuario) {
        this.fechaHora = fechaHora;
        this.sucursal = sucursal;
        this.computadora = computadora;
        this.usuario = usuario;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Long getSucursal() {
        return sucursal;
    }

    public void setSucursal(Long sucursal) {
        this.sucursal = sucursal;
    }

    public Long getComputadora() {
        return computadora;
    }

    public void setComputadora(Long computadora) {
        this.computadora = computadora;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.fechaHora);
        hash = 53 * hash + Objects.hashCode(this.sucursal);
        hash = 53 * hash + Objects.hashCode(this.computadora);
        hash = 53 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClaveCompuestaTx other = (ClaveCompuestaTx) obj;
        if (!Objects.equals(this.fechaHora, other.fechaHora)) {
            return false;
        }
        if (!Objects.equals(this.sucursal, other.sucursal)) {
            return false;
        }
        if (!Objects.equals(this.computadora, other.computadora)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClaveCompuestaVenta{" + "fechaHora=" + fechaHora + ", sucursal=" + sucursal + ", computadora=" + computadora + ", usuario=" + usuario + '}';
    }
    
}
