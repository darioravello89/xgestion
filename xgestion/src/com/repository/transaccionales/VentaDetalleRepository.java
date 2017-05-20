/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository.transaccionales;

import com.xgestion2.entities.maestros.Computadora;
import com.xgestion2.entities.maestros.Sucursal;
import com.xgestion2.entities.maestros.Usuario;
import com.xgestion2.entities.transaccionales.ClaveCompuestaTx;
import com.xgestion2.repository.*;
import com.xgestion2.entities.transaccionales.Venta;
import com.xgestion2.entities.transaccionales.VentaDetalle;
import com.xgestion2.util.DateUtils;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import xgestion.FormPrincipal;

public class VentaDetalleRepository extends GenericRepository<VentaDetalle, Long>{
   
    public List<Venta> getAllVentasActivasFecha(ClaveCompuestaTx id, String fecha) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Query query = session.createQuery("from Venta WHERE DATE(fechaHora) = :fecha AND sucursal= :sucursal AND computadora=:computadora AND usuario=:usuario AND activo = true")
                                            .setParameter("fecha", DateUtils.stringToDate(fecha))
                                            .setParameter("sucursal", id.getSucursal())
                                            .setParameter("computadora", id.getComputadora())
                                            .setParameter("usuario", id.getUsuario());
        List<Venta> e = query.list();
        session.close();
        return e;
    }

    public List<VentaDetalle> getDetalleDeVenta(ClaveCompuestaTx idVenta) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Query query = session.createQuery("from VentaDetalle e WHERE e.fechaHoraVenta = :fecha AND e.id.sucursal= :sucursal"
                + " AND e.id.computadora=:computadora AND e.id.usuario=:usuario AND e.activo = true")
                                            .setParameter("fecha", idVenta.getFechaHora())
                                            .setParameter("sucursal", idVenta.getSucursal())
                                            .setParameter("computadora", idVenta.getComputadora())
                                            .setParameter("usuario", idVenta.getUsuario());
        List<VentaDetalle> e = query.list();
        session.close();    
        return e;
    }
}
