/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Clima {
    
    private String uf;
    private String cidade;
    private String tempo;
    private float temperatura;
    
    private ArrayList<Observer>  observers = new ArrayList<>();
    
    public void attach(Observer observer){
        this.observers.add(observer);
    }
    
    public void dettach(Observer observer){
        this.observers.remove(observer);
    }
    
    public void notifyToAll(){
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
        this.notifyToAll();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
        this.notifyToAll();
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
        this.notifyToAll();
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        this.notifyToAll();
    }
    
    
    
    
}
