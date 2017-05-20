/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.maestros;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dario
 */

@Entity
@Table(name = "MA_PRODUCTOS")
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private Long id;
    
    @Column(name = "pro_nombre")
    private String nombre = "";
    
    @Column(name = "pro_descripcion")
    private String descripcion = "";
  
    @Column(name = "pro_codigo_barras")
    private String codigoBarras = "";
    
    @Column(name = "pro_codigo_interno")
    private String codigoInterno = "";
    
    @Column(name = "pro_codigo_proveedor")
    private String codigoProveedor = "";
    
    @Column(name = "pro_stockeable")
    private Boolean stockeable = true;
    
    @Column(name = "pro_contabilizable")
    private Boolean contabilizable = true;
    
    @Column(name = "pro_precio_manual")
    private Boolean precioManual = false;
    
    @Column(name = "pro_precio_costo")
    private Double precioCosto = 0.00;
    
    @Column(name = "pro_ganancia")
    private Integer ganancia = 0;
    
    @Column(name = "pro_precio_venta")
    private Double precioVenta = 0.00;
    
    @Column(name = "pro_precio_costo2")
    private Double precioCosto2 = 0.00;
    
    @Column(name = "pro_ganancia2")
    private Integer ganancia2 = 0;

    @Column(name = "pro_precio_venta2")
    private Double precioVenta2 = 0.00;

    @Column(name = "pro_modificado", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificado;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ume")
    private UME ume;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_familia")
    private Familia familia;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_subfamilia")
    private Subfamilia subfamilia;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ubicacion")
    private Ubicacion ubicacion;
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_proveedor")
    private Proveedor proveedor;
    
    @Column(name = "activo")
    private Boolean activo = true;

    @PrePersist
    protected void onCreate() {
        modificado = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        modificado = new Date();
    }

    public Producto() {
    }

    public Producto(String nombre, String descripcion, String codigoBarras, String codigoInterno, String codigoProveedor, Boolean stockeable, Boolean contabilizable, 
            Boolean precioManual, Double precioCosto, Integer ganancia, Double precioVenta, Double precioCosto2, Integer ganancia2, Double precioVenta2, Date modificado, 
            UME ume, Familia familia, Subfamilia subfamilia, Ubicacion ubicacion, Proveedor proveedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoBarras = codigoBarras;
        this.codigoInterno = codigoInterno;
        this.codigoProveedor = codigoProveedor;
        this.stockeable = stockeable;
        this.contabilizable = contabilizable;
        this.precioManual = precioManual;
        this.precioCosto = precioCosto;
        this.ganancia = ganancia;
        this.precioVenta = precioVenta;
        this.precioCosto2 = precioCosto2;
        this.ganancia2 = ganancia2;
        this.precioVenta2 = precioVenta2;
        this.modificado = modificado;
        this.ume = ume;
        this.familia = familia;
        this.subfamilia = subfamilia;
        this.ubicacion = ubicacion;
        this.proveedor = proveedor;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Boolean getStockeable() {
        return stockeable;
    }

    public void setStockeable(Boolean stockeable) {
        this.stockeable = stockeable;
    }

    public Boolean getContabilizable() {
        return contabilizable;
    }

    public void setContabilizable(Boolean contabilizable) {
        this.contabilizable = contabilizable;
    }

    public Boolean getPrecioManual() {
        return precioManual;
    }

    public void setPrecioManual(Boolean precioManual) {
        this.precioManual = precioManual;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Integer getGanancia() {
        return ganancia;
    }

    public void setGanancia(Integer ganancia) {
        this.ganancia = ganancia;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPrecioCosto2() {
        return precioCosto2;
    }

    public void setPrecioCosto2(Double precioCosto2) {
        this.precioCosto2 = precioCosto2;
    }

    public Integer getGanancia2() {
        return ganancia2;
    }

    public void setGanancia2(Integer ganancia2) {
        this.ganancia2 = ganancia2;
    }

    public Double getPrecioVenta2() {
        return precioVenta2;
    }

    public void setPrecioVenta2(Double precioVenta2) {
        this.precioVenta2 = precioVenta2;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    public UME getUme() {
        return ume;
    }

    public void setUme(UME ume) {
        this.ume = ume;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Subfamilia getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(Subfamilia subfamilia) {
        this.subfamilia = subfamilia;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", codigoBarras=" + codigoBarras + ", codigoInterno=" + codigoInterno + ", codigoProveedor=" + codigoProveedor + ", stockeable=" + stockeable + ", contabilizable=" + contabilizable + ", precioManual=" + precioManual + ", precioCosto=" + precioCosto + ", ganancia=" + ganancia + ", precioVenta=" + precioVenta + ", precioCosto2=" + precioCosto2 + ", ganancia2=" + ganancia2 + ", precioVenta2=" + precioVenta2 + ", modificado=" + modificado + ", ume=" + ume + ", familia=" + familia + ", subfamilia=" + subfamilia + ", ubicacion=" + ubicacion + ", proveedor=" + proveedor + ", activo=" + activo + '}';
    }
    
}
