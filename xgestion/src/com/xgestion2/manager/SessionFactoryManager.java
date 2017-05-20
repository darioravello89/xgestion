package com.xgestion2.manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.xgestion2.util.Encriptador;
import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import xgestion.FormPrincipal;

/**
 *
 * @author Marcelo
 */
public class SessionFactoryManager {

    private static SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        if (SessionFactoryManager.sessionFactory == null) {
            try {
                Configuration config = new AnnotationConfiguration().configure(new File("src/hibernate.cfg.xml"));
                config.setProperty("hibernate.connection.password", Encriptador.Desencriptar(config.getProperty("hibernate.connection.password")));
                config.setProperty("hibernate.connection.username", Encriptador.Desencriptar(config.getProperty("hibernate.connection.username")));
                sessionFactory = config.buildSessionFactory();
            } catch (Exception ex) {
                FormPrincipal.logger.error("Error: "+ex.toString());
            }        
        }
        return sessionFactory;
    }
    
    public void setSessionFactory(String key, String value) {
        try {

            AnnotationConfiguration conf = new AnnotationConfiguration().configure();
            conf.setProperty(key, value);
            sessionFactory = conf.buildSessionFactory();

        } catch (Exception ex) {
            FormPrincipal.logger.error("Error: "+ex.toString());
        }
    }
    
//
//    private SessionFactory buildSessionFactory(Configuration config) throws HibernateException {
//        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
//                applySettings(config.getProperties());
//        SessionFactory factory = config.buildSessionFactory(builder.build());
//        return factory;
//    }
//
//    private void addAnnotatedClasses(Configuration config) {
////        config.addAnnotatedClass(Auto.class);
//        config.addAnnotatedClass(LiquidacionDetalle.class);
//        config.addAnnotatedClass(Legajo.class);
//        config.addAnnotatedClass(Jerarquia.class);
//        config.addAnnotatedClass(Liquidacion.class);
//        config.addAnnotatedClass(Usuario.class);
//    }
//
//    private Properties getHibernateProperties() {
//        Properties props = new Properties();
//        // Establece el driver de conexion dependiente del RDBMS
//        props.put("hibernate.connection.driver_class", "org.gjt.mm.mysql.Driver");
//        // Establece la url de conexion dependiente del RDBMS
//        props.put("hibernate.connection.url", "jdbc:mysql://127.0.0.1:3306/hibernate");
//        // Establece el usuario
//        props.put("hibernate.connection.username", "root");
//        // Establece la clave
//        props.put("hibernate.connection.password", "ravelld");
//        // Establece el dialecto a utilizar
//        props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//        // Establece el uso de logging, deberá existir el archivo log4j.properties
//        props.put("hibernate.show_sql", "true");
//        //create update create-drop validate 
//        props.put("hibernate.hbm2ddl.auto", "validate"); 
//       
//        return props;
//    }
    
}
