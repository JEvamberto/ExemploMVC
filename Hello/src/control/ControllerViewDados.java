/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import model.Clima;
import model.Observer;
import view.ViewDados;

/**
 *
 * @author jose
 */
public class ControllerViewDados implements Observer {
    
    private Clima Model;
    private ViewDados view;
    
    public ControllerViewDados(Clima model, ViewDados view) {
      
       this.Model=model;
       this.view=view;
       
    }
    
    
     public void trataBotao(ActionEvent e) {
         
         if (e.getActionCommand()==) {
             
         }
       
    }
    
    

    @Override
    public void update() {
        
    }

   
    
}
