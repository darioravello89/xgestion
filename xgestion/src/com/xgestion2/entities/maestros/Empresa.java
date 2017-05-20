/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.maestros;

import com.xgestion2.util.Encriptador;
import java.io.Serializable;
import java.sql.Blob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import xgestion.FormPrincipal;

/**
 *
 * @author dario
 */

@Entity
@Table(name = "MA_EMPRESAS")
public class Empresa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "em_id")
    private Long id;
    
    @Column(name = "em_nombre")
    private String nombre;
       
    @Column(name = "em_direccion")
    private String direccion;
    
    @Column(name = "em_cuit")
    private String cuit;
    
    @Column(name = "em_telefono")
    private String telefono;
    
    @Column(name = "em_logo")
    private byte[] logo;
    
    @Column(name = "em_fecha_licencia")
    private String licencia;
 
    @Column(name = "em_activo")
    private Boolean activo = true;

    public Empresa() {
    }

    public Empresa(String nombre, String direccion, String cuit, String telefono, byte[] logo, String licencia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuit = cuit;
        this.telefono = telefono;
        this.logo = logo;
        this.licencia = licencia;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getLicencia() {
        try {
            return Encriptador.Desencriptar(licencia);
        } catch (Exception ex) {
            FormPrincipal.logger.error("ERROR: ",ex);
            return "";
        }   
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", cuit=" + cuit + ", telefono=" + telefono + ", logo=" + logo + ", licencia=" + licencia + ", activo=" + activo + '}';
    }
   
}
