/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversorium.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lucas
 */
public class View extends JFrame {
    
    private JPanel panel1;
    private JButton boton1;
    
    public View () {
        
        setSize (500, 300);
        
        panel1 = new JPanel ();
        
        boton1 = new JButton ("OK");
        
        panel1.add (boton1);
        
        add (panel1);
    }
}
