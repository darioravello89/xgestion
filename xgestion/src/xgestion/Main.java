/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xgestion;


/**
 *
 * @author dario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        FormPrincipal principal = new FormPrincipal();
        principal.setVisible(true);
        principal.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        principal.repaint();
    }
    
}
