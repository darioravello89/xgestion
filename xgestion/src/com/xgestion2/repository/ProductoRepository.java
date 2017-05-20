/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.repository;

import com.xgestion.listas.ListaProductosConMismoCodigo;
import com.xgestion2.entities.maestros.Familia;
import com.xgestion2.entities.maestros.Producto;
import com.xgestion2.entities.maestros.Proveedor;
import com.xgestion2.entities.maestros.Subfamilia;
import com.xgestion2.entities.maestros.Sucursal;
import com.xgestion2.entities.maestros.Ubicacion;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import xgestion.FormPrincipal;

/**
 *
 * @author Marcelo
 */
public class ProductoRepository extends GenericRepository<Producto, Long>{

    public List<Producto> getAll(String buscar) {
        Session session = getSessionFactory().openSession();

        List<Producto> e= session.createQuery("from Producto where nombre like :buscar and activo = true" )
                        .setParameter("buscar", "%" + buscar + "%")
                        .list();
        session.close();
        return e;
    }
    
    public List<Producto> getAll(String buscar, Familia familia, Subfamilia subfamilia, Ubicacion ubicacion, Proveedor proveedor) {
        Session session = getSessionFactory().openSession();
        String query = "FROM Producto WHERE nombre LIKE :buscar AND activo = true ";
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
        
        List<Producto> e = sql.list();
        session.close();
        return e;
    }
    
    public void modificarPrecio(Long id, Double precioCosto, Integer porcantejaGanancia, Double precioVenta, Double precioCosto2, Integer porcantejaGanancia2, Double precioVenta2) {
        
        Session session = FormPrincipal.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
           Query sql = session.createQuery( "UPDATE Producto SET precioCosto=:precioCosto,ganancia=:ganancia,precioVenta=:precioVenta,precioCosto2=:precioCosto2,ganancia2=:ganancia2,"
                                            + "precioVenta2=:precioVenta2 WHERE id=:id" )
                              .setParameter("precioCosto", precioCosto)
                              .setParameter("ganancia", porcantejaGanancia)
                              .setParameter("precioVenta", precioVenta)
                              .setParameter("precioCosto2", precioCosto2)
                              .setParameter("ganancia2", porcantejaGanancia2)
                              .setParameter("precioVenta2", precioVenta2)
                              .setParameter("id", id);
            int result = sql.executeUpdate();
            tx.commit();
        } catch (HibernateException exception) {
            tx.rollback();
            throw exception;
        } finally {
            session.close();
        }
    }
    
    public Producto getProductByCodigo(String codigo) {
        
        Session session = getSessionFactory().openSession();
        
        Query query = session.createQuery("select count(*) FROM Producto WHERE activo = true AND codigoBarras = :codigo")
                                    .setParameter("codigo", codigo);
        Long count = (Long)query.uniqueResult();
        
        //SI HAY MAS DE UN PRODUCTO CON EL MISMO CODIGO
        Producto e=null;
        if(count==1L){
            Query sql = session.createQuery( "FROM Producto WHERE activo = true AND codigoBarras = :codigo" )
                                    .setParameter("codigo", codigo);
            e = (Producto) sql.uniqueResult();
        }else if(count>1L){
            ListaProductosConMismoCodigo z = new ListaProductosConMismoCodigo(codigo);
            z.setVisible(true);
            e = (Producto) get(Long.valueOf(z.getSeleccionado()));
        }        
        session.close();
        return e;
    }
    
    public List<Producto> getAllProductByCodigo(String codigo) {
        Session session = getSessionFactory().openSession();
        Query sql = session.createQuery( "FROM Producto WHERE activo = true AND codigoBarras = :codigo" )
                                .setParameter("codigo", codigo);
        
        List<Producto> e = sql.list();
        session.close();
        return e;
    }
    
}
