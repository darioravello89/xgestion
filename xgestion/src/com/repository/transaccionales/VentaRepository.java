/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository.transaccionales;

import com.xgestion2.entities.maestros.Cliente;
import com.xgestion2.entities.maestros.Estado;
import com.xgestion2.entities.maestros.Pago;
import com.xgestion2.entities.transaccionales.ClaveCompuestaTx;
import com.xgestion2.repository.*;
import com.xgestion2.entities.transaccionales.Venta;
import com.xgestion2.util.DateUtils;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import xgestion.FormPrincipal;

public class VentaRepository extends GenericRepository<Venta, Long>{
   
    
    public List<Venta> getAllVentasActivasFecha(String fecha, String texto, String sucursal, String computadora, String usuario) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Query query = session.createQuery("from Venta WHERE DATE(fechaHora) = :fecha AND sucursal= :sucursal AND computadora=:computadora AND usuario=:usuario AND activo = true")
                                            .setParameter("fecha", DateUtils.stringToDate(fecha))
                                            .setParameter("sucursal", Long.valueOf(sucursal))
                                            .setParameter("computadora", Long.valueOf(computadora))
                                            .setParameter("usuario", Long.valueOf(usuario));
           
        List<Venta> e = query.list();
        session.close();
        return e;
    }
    
    public Venta nuevaVenta() {
        Cliente cliente = new Cliente();
        Pago pago = new Pago();
        Estado estado = new Estado();
        EstadoRepository estadoRepo = new EstadoRepository();
        ClienteRepository clienteRepo = new ClienteRepository();
        PagoRepository pagoRepo = new PagoRepository();
        cliente = clienteRepo.get(1L);
        pago = pagoRepo.get(1L);
        estado = estadoRepo.get(1L);
        
        ClaveCompuestaTx clave = new ClaveCompuestaTx();
        
        Venta venta = new Venta(clave,cliente, pago,estado);
        
        return venta;
    }
    
}
