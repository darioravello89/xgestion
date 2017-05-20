/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xgestion2.util;

import java.io.File;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.SQLExec;
import xgestion.FormPrincipal;

public class EjecutadorSQL {
    
    public void executeSql(String sqlFilePath) {
        
        final class SqlExecuter extends SQLExec {
            public SqlExecuter() {
                Project project = new Project();
                project.init();
                setProject(project);
                setTaskType("sql");
                setTaskName("sql");
            }
        }
        
        try {
            SqlExecuter executer = new SqlExecuter();
            executer.setSrc(new File(sqlFilePath));
            executer.setDriver(Encriptador.Desencriptar(FormPrincipal.prop.getProperty("conexionDriver")));
            executer.setPassword(Encriptador.Desencriptar(FormPrincipal.prop.getProperty("conexionPassword")));
            executer.setUserid(Encriptador.Desencriptar(FormPrincipal.prop.getProperty("conexionUsuario")));
            executer.setUrl(Encriptador.Desencriptar(FormPrincipal.prop.getProperty("conexionURL")));
            executer.execute();
            
        } catch (Exception ex) {
           FormPrincipal.logger.error("ERROR: "+ex.toString());
        }
    }
}
