/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import com.xgestion2.entities.maestros.Producto;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author dario
 */

@Entity
@Table(name = "IN_COMPRAS_DE")
public class CompraDetalle implements Serializable {
    
    @EmbeddedId
    private ClaveCompuestaTx id;
           
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_producto")
    private Producto producto;
    
    @Column(name = "cod_cantidad")
    private Double cantidad;
    
    @Column(name = "cod_precio_unitario")
    private Double precioUnitario;
    
    @Column(name = "cod_precio_total")
    private Double precioTotal;

    @Column(name = "cod_recibido")
    private Boolean recibido;
   
    @Column(name = "cod_activo")
    private Boolean activo;
    
    @Column(name = "cod_actualiza_precio")
    private Boolean actualizaPrecio;
    
    @Column(name = "cod_suma_stock")
    private Boolean sumaStock;

    public CompraDetalle() {
    }

   
}
