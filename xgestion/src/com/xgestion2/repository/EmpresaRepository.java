package com.xgestion2.repository;

import com.xgestion2.entities.maestros.Empresa;
import com.xgestion2.util.DateUtils;
import com.xgestion2.util.Encriptador;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import xgestion.FormPrincipal;

public class EmpresaRepository extends GenericRepository<Empresa, Long>{

    public List<Empresa> getAll(String buscar) {
        Session session = getSessionFactory().openSession();
        // Select * from autos  
        // from Auto
        List<Empresa> e= session.createQuery("from Empresa where nombre like :buscar and activo = true" )
                        .setParameter("buscar", "%" + buscar + "%")
                        .list();
        session.close();
        return e;
    }
    
     public Empresa crearSiNoExiste(Long id) {
        
        Session session = FormPrincipal.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Long count = (Long) session.createQuery(
                        " select count(e) from Empresa e WHERE id=:id ")
                        .setParameter("id", id)
                        .uniqueResult();
        Empresa e =null;
        if(count==0){
            
           e = new Empresa();
        
            try {
                session.save(e);
                tx.commit();
            } catch (HibernateException exception) {
                tx.rollback();
                FormPrincipal.logger.error("Error",exception);
            } finally {
                session.close();
            }
        }
        return e;
    }
     
    public Boolean actualizarLicencia(Empresa e) {
        
        Boolean resultado = false;
        String fecha;
        String activar;
        try {
            String[] split = Encriptador.Desencriptar(e.getLicencia()).split("\\|");
            fecha = split[0];

            //PARA ACTUALIZAR LICENCIA
            if (split.length == 1) {

                if (isValidDate(fecha)) {
                    update(e);
                    resultado = true;
                    JOptionPane.showMessageDialog(null, "Código cargado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "El código ingresado no es válido.");
                }

            //PARA DESBLOQUEAR COMPUTADORA
            } else if (split.length == 2) {

                activar = split[1];

                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = null;

                try {
                    date = formatter.parse(fecha);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                if (DateUtils.isToday(date)) {
//                    if (Boolean.valueOf(activar)) {
//                        MainXG.computadora.bloquearComputadora();
//                        JOptionPane.showMessageDialog(null, "Computadora bloqueada.");
//                    } else {
//                        MainXG.computadora.desbloquearComputadora();
//                        JOptionPane.showMessageDialog(null, "Computadora desbloqueada.");
//                        dispose();
//                    }
                    resultado = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El código ha caducado.");
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: El código ingresado no es válido."+ex.getMessage());
            FormPrincipal.logger.error("Error",ex);
        }

        return resultado;
    }
    
    public static boolean isValidDate(String inDate) {
		
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
          dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
          return false;
        }
        return true;
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
