/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import com.xgestion2.entities.maestros.Cliente;
import com.xgestion2.entities.maestros.Computadora;
import com.xgestion2.entities.maestros.Pago;
import com.xgestion2.entities.maestros.Estado;
import com.xgestion2.entities.maestros.Sucursal;
import com.xgestion2.entities.maestros.Usuario;
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

@Entity
@Table(name = "IN_VENTAS")
public class Venta implements Serializable {
    
    @EmbeddedId
    private ClaveCompuestaTx id;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ven_cliente")
    private Cliente cliente;
  
    @Column(name = "ven_iva")
    private Double iva = 0.00;
    
    @Column(name = "ven_total")
    private Double total = 0.00;

    @Column(name = "ven_subtotal")
    private Double pagado = 0.00;
    
    @Column(name = "ven_descuento")
    private Double descuento = 0.00;
    
    @Column(name = "ven_notas")
    private String notas ="";
    
    @Column(name = "ven_motivo_anula")
    private String motivoAnula ="";
        
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ven_pago")
    private Pago pago;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ven_estado")
    private Estado estado;
    
    @Column(name = "ven_activo")
    private Boolean activo =true;
            
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ven_fecha_hora_modificado", nullable = false, updatable=false)
    private Date fechaHoraModificado;

    @PreUpdate
    protected void onUpdate() {
        fechaHoraModificado = new Date();
    }
        
    public Venta() {
    }

    public Venta(ClaveCompuestaTx id, Cliente cliente, Pago pago, Estado estado) {
        this.id = id;
        this.cliente = cliente;
        this.pago = pago;
        this.estado = estado;
    }

    public ClaveCompuestaTx getId() {
        return id;
    }

    public void setId(ClaveCompuestaTx id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getMotivoAnula() {
        return motivoAnula;
    }

    public void setMotivoAnula(String motivoAnula) {
        this.motivoAnula = motivoAnula;
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

    public Date getFechaHoraModificado() {
        return fechaHoraModificado;
    }

    public void setFechaHoraModificado(Date fechaHoraModificado) {
        this.fechaHoraModificado = fechaHoraModificado;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", cliente=" + cliente + ", iva=" + iva + ", total=" + total + ", pagado=" + pagado + ", descuento=" + descuento + ", notas=" + notas + ", motivoAnula=" + motivoAnula + ", pago=" + pago + ", estado=" + estado + ", activo=" + activo + ", fechaHoraModificado=" + fechaHoraModificado + '}';
    }
    
}
