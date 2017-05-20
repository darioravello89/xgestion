/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.transaccionales;

import com.xgestion2.entities.maestros.Pago;
import com.xgestion2.entities.maestros.Cliente;
import java.io.Serializable;
import java.sql.Timestamp;
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
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dario
 */

@Entity
@Table(name = "IN_CUENTAS_CORRIENTES_CLIENTES")
public class CuentaCorrienteCliente implements Serializable {
    
   @EmbeddedId
    private ClaveCompuestaTx id;
           
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ccc_cliente")
    private Cliente cliente;    
    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ccc_pago")
    private Pago pago;    
    
    @Column(name = "ccc_ingreso")
    private Double ingreso;
    
    @Column(name = "ccc_egreso")
    private Double egreso;
       
    @Column(name = "ccc_notas")
    private String notas;
   
    public CuentaCorrienteCliente() {
    }

    public CuentaCorrienteCliente(ClaveCompuestaTx id, Cliente cliente, Pago pago, Double ingreso, Double egreso, String notas) {
        this.id = id;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        return "CuentaCorrienteCliente{" + "id=" + id + ", cliente=" + cliente + ", pago=" + pago + ", ingreso=" + ingreso + ", egreso=" + egreso + ", notas=" + notas + '}';
    }

}
