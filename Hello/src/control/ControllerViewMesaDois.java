/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Servidor;
import model.Observer;
import view.ViewMesaDois;

/**
 *
 * @author jose
 */
public class ControllerViewMesaDois implements Observer {
    
    private Servidor model;
    private ViewMesaDois view;
    
    public ControllerViewMesaDois (Servidor model, ViewMesaDois view){
        this.model=model;
        this.view=view;
        this.model.attach(this);
    
    }
    
    @Override
    public void update() {
       
    }
    
    
    
    
}
