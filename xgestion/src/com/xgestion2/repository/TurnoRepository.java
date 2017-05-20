/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.repository;

import com.xgestion2.entities.maestros.Turno;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import xgestion.FormPrincipal;

/**
 *
 * @author Marcelo
 */
public class TurnoRepository extends GenericRepository<Turno, Long>{

    public List<Turno> getAll(String buscar) {
        Session session = getSessionFactory().openSession();
        // Select * from autos  
        // from Auto
        List<Turno> e= session.createQuery("from Turno where nombre like :buscar and activo = true" )
                        .setParameter("buscar", "%" + buscar + "%")
                        .list();
        session.close();
        return e;
    }
    
    public Turno getTurnoActual() {
        Session session = FormPrincipal.sessionFactory.openSession();
        Query query = session.createQuery("from Turno WHERE current_time() BETWEEN desde AND hasta AND activo = true");
        Turno e = (Turno) query.uniqueResult();
        session.close();
        return e;
    }
    
    
//    public void deleteById(Long id) {
//        Session session = getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        
//        try {
//            
//            Query q1 = session.createQuery("delete from LiquidacionDetalle where liquidacion in (:id) ");
//            q1.setLong("id", id);
//            q1.executeUpdate();
//            tx.commit();
//            
//            tx = session.beginTransaction();
//            
//            Query q = session.createQuery("delete from Liquidacion where id in (:id) ");
//            q.setLong("id", id);
//            q.executeUpdate();
//            tx.commit();
//        } catch (HibernateException exception) {
//            tx.rollback();
//            throw exception;
//        } finally {
//            session.close();
//        }
//    }
}
