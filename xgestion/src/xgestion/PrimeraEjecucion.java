/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xgestion;

import com.xgestion2.util.EjecutadorSQL;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PrimeraEjecucion {
    
    public PrimeraEjecucion(){
                
        if(Boolean.valueOf(FormPrincipal.prop.getProperty("iniciaPrimeraVez"))){
            
            //SE EJECUTAN CONSULTAS INICIALES
            EjecutadorSQL script = new EjecutadorSQL();
            script.executeSql(FormPrincipal.prop.getProperty("iniciaPrimeraVezScriptSQL"));
            
            //SE CAMBIA LA PROPIEDAD DE LA CONFIGURACION HIBERNATE DE CREATE A UPDATE

            //AL FINAL DESACTIVA SWITCH INSTALADOR
            try {
                FileOutputStream out = new FileOutputStream("config.properties");
                Properties props = new Properties();
                props.setProperty("iniciaPrimeraVez", "false");
                try {
                    props.store(out, null);
                    out.close();
                } catch (IOException ex) {
                    FormPrincipal.logger.error("ERROR: "+ex.toString());
                }

            } catch (FileNotFoundException ex) {
                FormPrincipal.logger.error("ERROR: "+ex.toString());
            }

            //SALE DEL PROGRAMA
            //System.exit(0);
        }
    }
}
