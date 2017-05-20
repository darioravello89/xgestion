
package com.repository.transaccionales;

import com.xgestion2.entities.transaccionales.Compra;
import com.xgestion2.repository.*;
import com.xgestion2.entities.transaccionales.Venta;
import com.xgestion2.util.DateUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import xgestion.FormPrincipal;

public class CompraRepository extends GenericRepository<Venta, Long>{
   
    
    public List<Compra> getAllActivosFiltrado(String fecha, String texto, String sucursal, String computadora, String usuario) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Query query = session.createQuery("from Venta WHERE DATE(fechaHora) = :fecha AND sucursal= :sucursal AND computadora=:computadora AND usuario=:usuario AND activo = true")
                                            .setParameter("fecha", DateUtils.stringToDate(fecha))
                                            .setParameter("sucursal", Long.valueOf(sucursal))
                                            .setParameter("computadora", Long.valueOf(computadora))
                                            .setParameter("usuario", Long.valueOf(usuario));
           
        List<Compra> e = query.list();
        session.close();
        return e;
    }
    
}
