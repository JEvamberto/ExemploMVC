/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Clima;
import model.Observer;
import view.ViewMesa;

/**
 *
 * @author jose
 */
public class ControllerViewMesa implements Observer {
    private ViewMesa view;
    private Clima model;
    public ControllerViewMesa(Clima model, ViewMesa view) {
        this.model=model;
        this.view=view;
        model.attach(this);
    }

    @Override
    public void update() {
      
    }
    
}
