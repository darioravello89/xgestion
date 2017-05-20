/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import com.xgestion2.entities.maestros.Producto;
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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "IN_VENTAS_DETALLE")
public class VentaDetalle implements Serializable {
    
    @EmbeddedId
    private ClaveCompuestaTx id;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pk_ven_fecha_hora", nullable = false)
    private Date fechaHoraVenta;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ved_producto")
    private Producto producto;
    
    @Column(name = "ved_cantidad")
    private Double cantidad;
    
    @Column(name = "ved_precio_unitario")
    private Double precioUnitario;
    
    @Column(name = "ved_precio_total")
    private Double precioTotal;
    
    @Column(name = "ved_descuento")
    private Double descuento;
   
    @Column(name = "ved_activo")
    private Boolean activo;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ved_fecha_hora_modificado", nullable = false, updatable=false)
    private Date fechaHoraModificado;

    @PreUpdate
    protected void onUpdate() {
        fechaHoraModificado = new Date();
    }

    public VentaDetalle() {
    }

    public VentaDetalle(ClaveCompuestaTx id, Date fechaHoraVenta, Producto producto, Double cantidad, Double precioUnitario, 
            Double precioTotal, Double descuento) {
        this.id = id;
        this.fechaHoraVenta = fechaHoraVenta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
        this.descuento = descuento;
    }

    public ClaveCompuestaTx getId() {
        return id;
    }

    public void setId(ClaveCompuestaTx id) {
        this.id = id;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
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
        return "VentaDetalle{" + "id=" + id + ", fechaHoraVenta=" + fechaHoraVenta + ", producto=" + producto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", precioTotal=" + precioTotal + ", descuento=" + descuento + ", activo=" + activo + ", fechaHoraModificado=" + fechaHoraModificado + '}';
    }
    
}
