/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicadesktop;

import javax.swing.JFrame;

/**
 *
 * @author joao.c
 */
public class ClinicaDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Registo registo = new Registo();
        Rastreio rastreio = new Rastreio();
        
        frame.add(rastreio);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1500, 900);
    }
    
}
