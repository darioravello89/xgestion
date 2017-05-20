/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import com.xgestion2.entities.maestros.Pago;
import com.xgestion2.entities.maestros.Estado;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dario
 */

@Entity
@Table(name = "IN_COMPRAS_CA")
public class Compra implements Serializable {
    
    @EmbeddedId
    private ClaveCompuestaTx id;
    
    @Column(name = "com_comprobante")
    private String comprobante;
  
    @Column(name = "com_iva")
    private Double iva;
    
    @Column(name = "com_total")
    private Double total;
    
    @Column(name = "com_pagado")
    private Double pagado;
    
    @Column(name = "com_notas")
    private String notas;
        
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pago")
    private Pago pago;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_estado")
    private Estado estado;
    
    @Column(name = "com_activo")
    private Boolean activo;
    
    @Column(name = "com_fecha_hora_modifica", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraModifica;
    
    @Column(name = "com_fecha_hora_fin", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraFin;
           
    @Column(name = "com_usuario_modifica")
    private Long usuarioModifica;
    
    @Column(name = "com_usuario_fin")
    private Long usuarioFin;
    
    @PreUpdate
    protected void onUpdate() {
        fechaHoraModifica = new Date();
    }

    public Compra() {
    }

    public Compra(ClaveCompuestaTx id, String comprobante, Double iva, Double total, Double pagado, String notas, Pago pago, Estado estado, Boolean activo, Date fechaHoraModifica, Date fechaHoraFin, Long usuarioModifica, Long usuarioFin) {
        this.id = id;
        this.comprobante = comprobante;
        this.iva = iva;
        this.total = total;
        this.pagado = pagado;
        this.notas = notas;
        this.pago = pago;
        this.estado = estado;
        this.activo = activo;
        this.fechaHoraModifica = fechaHoraModifica;
        this.fechaHoraFin = fechaHoraFin;
        this.usuarioModifica = usuarioModifica;
        this.usuarioFin = usuarioFin;
    }

    public ClaveCompuestaTx getId() {
        return id;
    }

    public void setId(ClaveCompuestaTx id) {
        this.id = id;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getPagado() {
        return pagado;
    }

    public void setPagado(Double pagado) {
        this.pagado = pagado;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Date getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Long getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(Long usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public Long getUsuarioFin() {
        return usuarioFin;
    }

    public void setUsuarioFin(Long usuarioFin) {
        this.usuarioFin = usuarioFin;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id.toString() + ", comprobante=" + comprobante + ", iva=" + iva + ", total=" + total + ", pagado=" + pagado + ", notas=" + notas + ", pago=" + pago + ", estado=" + estado + ", activo=" + activo + ", fechaHoraModifica=" + fechaHoraModifica + ", fechaHoraFin=" + fechaHoraFin + ", usuarioModifica=" + usuarioModifica + ", usuarioFin=" + usuarioFin + '}';
    }
      
}
