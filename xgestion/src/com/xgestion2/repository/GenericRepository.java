package com.xgestion2.repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import xgestion.FormPrincipal;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Marcelo
 * @param <E>
 * @param <PK>
 */
public abstract class GenericRepository<E, PK extends Serializable> {
 
    private Class getType(){
        //AutoRepository
        Class clazz = this.getClass();
        //GenericRepository<Auto,Long>
        ParameterizedType parameterizedSuperClass = (ParameterizedType) clazz.getGenericSuperclass();
       //<Auto,Long>
        Type[] types = parameterizedSuperClass.getActualTypeArguments();
        //Auto
        return (Class) types[0];
    } 
   
    public PK save(E e) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Serializable id = null;
        try {
            id = session.save(e);
            tx.commit();
        } catch (HibernateException exception) {
            tx.rollback();
            throw exception;
        } finally {
            session.close();
        }
        return (PK) id;
    }

    public void update(E e) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.update(e);
            tx.commit();
        } catch (HibernateException exception) {
            tx.rollback();
            throw exception;
        } finally {
            session.close();
        }
    }

    public void delete(E e) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.delete(e);
            tx.commit();
        } catch (HibernateException exception) {
            tx.rollback();
            throw exception;
        } finally {
            session.close();
        }
    }
        
     public E get(PK id) {
        Session session = FormPrincipal.sessionFactory.openSession();
        E e = (E) session.get(getType(), id);
        session.close();
        return e;
    }
     
    public List<E> getAll(int pageNumber,int pageSize) {
        Session session = FormPrincipal.sessionFactory.openSession();
        Query query = session.createQuery("from "+getType().getName());
        query.setFirstResult((pageNumber - 1) * pageSize);
        query.setMaxResults(pageSize);
        List<E> e = query.list();
        session.close();
        return e;
    }      

    public List<E> getAll() {
        Session session = FormPrincipal.sessionFactory.openSession();
        // Select * from autos  
        // from Auto
        Query query = session.createQuery("from " +getType().getName());
        List<E> e = query.list();
        session.close();
        return e;
    }
    
    public List<E> getAllActivos() {
        
        Session session = FormPrincipal.sessionFactory.openSession();
        
        Query contador = session.createQuery("select count(*) from " +getType().getName()+" WHERE activo = true");
        Long count = (Long)contador.uniqueResult();
        
        if(count.doubleValue() > 0){
            Query query = session.createQuery("from " +getType().getName()+" WHERE activo = true");
            List<E> e = query.list();
            return e;
        }else{
            return null;
        }
    }
    
     public Long count(){
        Session session = FormPrincipal.sessionFactory.openSession();
        Query query = session.createQuery("select count(e) from " + getType().getName() + " e ");
        Long count = (Long) query.uniqueResult();
        session.close();
        return count;
        
    }
     
    public SessionFactory getSessionFactory() {
        return FormPrincipal.sessionFactory;
    }
    
}
