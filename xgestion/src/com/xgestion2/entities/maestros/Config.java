/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.entities.maestros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import xgestion.FormPrincipal;

/**
 *
 * @author dario
 */
public class Config {
    
    public static Properties prop;
    public static String fileConfig="config.properties";
 
    public Properties getPropValues() throws IOException {
        InputStream inputStream = null;
        try {
            prop = new Properties();
            inputStream = getClass().getClassLoader().getResourceAsStream(fileConfig);
 
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + fileConfig + "' not found in the classpath");
            }
	} catch (Exception e) {
            FormPrincipal.logger.error("Exception: " + e);
	} finally {
            inputStream.close();
	}
        
        return prop;
    }
    
    public void setPropValue(String key, String value) throws IOException {
        
        Properties props;
        try (FileInputStream in = new FileInputStream("src/"+fileConfig)) {
            props = new Properties();
            props.load(in);
       
            FileOutputStream out = new FileOutputStream("src/"+fileConfig);
            props.setProperty(key, value);
            props.store(out, null);
            out.close();
            
         }catch (Exception e) {
             FormPrincipal.logger.error("Exception: " + e);
	} 

    }
}
