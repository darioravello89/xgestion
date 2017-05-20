/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository.transaccionales;

import com.xgestion2.entities.maestros.Familia;
import com.xgestion2.entities.maestros.Producto;
import com.xgestion2.entities.maestros.Proveedor;
import com.xgestion2.entities.maestros.Subfamilia;
import com.xgestion2.entities.maestros.Sucursal;
import com.xgestion2.entities.maestros.Ubicacion;
import com.xgestion2.entities.transaccionales.ClaveCompuestaTx;
import com.xgestion2.entities.transaccionales.Movimiento;
import com.xgestion2.repository.*;
import com.xgestion2.entities.transaccionales.Venta;
import com.xgestion2.util.DateUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import xgestion.FormPrincipal;

public class MovimientoRepository extends GenericRepository<Venta, Long>{
   
    
   
    public List<Movimiento> getStockBySucursal(String buscar, Familia familia, Subfamilia subfamilia, Ubicacion ubicacion, Proveedor proveedor, Sucursal sucursal) {
        Session session = getSessionFactory().openSession();
        String query = "FROM Movimiento WHERE sucursal = :sucursal AND activo = true AND tipo =:tipo  ";
        if(familia != null)
            query = query + " AND familia=:familia ";
        if(subfamilia != null)
            query = query +  " AND subfamilia =:subfamilia ";
        if(ubicacion != null)
            query = query +  " AND ubicacion=:ubicacion ";
        if(proveedor != null)
            query = query +  " AND proveedor=:proveedor ";
                
        Query sql = session.createQuery( query );
        
        sql.setParameter("buscar", "%" + buscar + "%");
        if(familia != null)
            sql.setParameter("familia", familia);
        if(subfamilia != null)
            sql.setParameter("subfamilia", subfamilia);
        if(ubicacion != null)    
            sql.setParameter("ubicacion", ubicacion);
        if(proveedor != null)
            sql.setParameter("proveedor", proveedor);
        
        List<Movimiento> e = sql.list();
        session.close();
        return e;
    }
    
    
}
