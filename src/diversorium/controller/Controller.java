/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversorium.controller;

import diversorium.model.Model;
import diversorium.view.View;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author lucas
 */
public class Controller {
    
    private Model model;
    private View view;
    
    public Controller (Model model, View view) {
        
        this.model = model;
        this.view = view;
        
        this.view.setVisible (true);
        
        this.view.addWindowListener (new ControllerWindowListener () );
    }
    
    class ControllerWindowListener extends WindowAdapter {
        
        @Override
        public void windowClosing (WindowEvent we) {
            
            System.exit (0);
        }
    }
}
