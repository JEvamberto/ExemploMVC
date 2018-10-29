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
       this.Model.attach(this);
       
    }
    
    
     public void trataBotao(ActionEvent e) {
         
         if ("Add temperatura".equals(e.getActionCommand())) {
             this.Model.setTemperatura(Float.parseFloat(this.view.getTxt_Temperatura().getText())); 
         }
         
         
         if ("Add Tempo".equals(e.getActionCommand())) {
             
             this.Model.setTempo(this.view.getTxt_addTempo().getText());
                     
             
         }
         if ("Add cidade".equals(e.getActionCommand())) {
             
             this.Model.setCidade(this.view.getTxt_addCidade().getText());
             
         }
         
         if ("Add UF".equals(e.getActionCommand())) {
             this.Model.setUf(this.view.getTxt_addUf().getText());
         }
       
    }
    
    

    @Override
    public void update() {
        
    }

   
    
}
