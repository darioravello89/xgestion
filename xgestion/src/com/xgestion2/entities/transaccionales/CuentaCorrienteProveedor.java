/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import com.xgestion2.entities.maestros.Pago;
import com.xgestion2.entities.maestros.Proveedor;
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
@Table(name = "IN_CUENTAS_CORRIENTES_PROVEEDORES")
public class CuentaCorrienteProveedor implements Serializable {
    
    @EmbeddedId
    private ClaveCompuestaTx id;
          
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ccp_proveedor")
    private Proveedor proveedor;    
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ccp_pago")
    private Pago pago;    
      
    @Column(name = "ccp_ingreso")
    private Double ingreso;
    
    @Column(name = "ccp_egreso")
    private Double egreso;
       
    @Column(name = "ccp_notas")
    private String notas;

    public CuentaCorrienteProveedor() {
    }

    public CuentaCorrienteProveedor(ClaveCompuestaTx id, Proveedor proveedor, Pago pago, Double ingreso, Double egreso, String notas) {
        this.id = id;
        this.proveedor = proveedor;
        this.pago = pago;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.notas = notas;
    }

    public ClaveCompuestaTx getId() {
        return id;
    }

    public void setId(ClaveCompuestaTx id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public Double getEgreso() {
        return egreso;
    }

    public void setEgreso(Double egreso) {
        this.egreso = egreso;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "CuentaCorrienteProveedor{" + "id=" + id.toString() + ", proveedor=" + proveedor + ", pago=" + pago + ", ingreso=" + ingreso + ", egreso=" + egreso + ", notas=" + notas + '}';
    }

}
