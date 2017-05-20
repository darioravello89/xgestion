/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.repository;

import com.xgestion2.entities.maestros.Config;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Marcelo
 */
public class ConfigRepository extends GenericRepository<Config, Long>{

    public List<Config> getAll(String buscar) {
        Session session = getSessionFactory().openSession();
        // Select * from autos  
        // from Auto
        List<Config> e= session.createQuery("from Config where nombre like :buscar and activo = true" )
                        .setParameter("buscar", "%" + buscar + "%")
                        .list();
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
