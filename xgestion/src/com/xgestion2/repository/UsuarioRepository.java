/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.repository;

import com.xgestion2.entities.maestros.Usuario;
import xgestion.FormPrincipal;
import org.hibernate.Session;

/**
 *
 * @author Marcelo
 */
public class UsuarioRepository extends GenericRepository<Usuario, Long>{
   
    public Boolean isUsuarioPasswordValido (String usuario, String password) {
         
        Session session = FormPrincipal.sessionFactory.openSession();
        Usuario x = (Usuario) session.createQuery(
                " from Usuario x where x.usuario = :usuario and x.password=:password")
                .setParameter("usuario", usuario)
                .setParameter("password", password)
                .uniqueResult();
        session.close();
        
        if(x != null )
            return true;
        else
            return false;
    }
     
    public Usuario getUsuario(String usuario, String password) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Usuario x = (Usuario) session.createQuery(
                " from Usuario x where x.usuario = :usuario and x.password=:password")
                .setParameter("usuario", usuario)
                .setParameter("password", password)
                .uniqueResult();
        session.close();
        return x;
    }     
}
