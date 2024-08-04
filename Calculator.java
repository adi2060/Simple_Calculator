/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_frame;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator_Frame cf=new Calculator_Frame();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        cf.setVisible(true);
        cf.setSize(d);
        
        // TODO code application logic here
    }
    
}
