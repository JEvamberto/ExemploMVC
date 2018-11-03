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
public class Servidor {
    
    private Uf uf;
    private Cidade cidade;
    private Tempo tempo;
    private Temperatura temperatura;
    
    private ArrayList<Observer>  observers = new ArrayList<>();
    
    
    
    public void attach(Observer observer){
        this.observers.add(observer);
    }
    
    public void dettach(Observer observer){
        this.observers.remove(observer);
    }
    
    public Servidor(){
        this.uf=new Uf();
        this.cidade= new Cidade();
        this.tempo=new Tempo();
        this.temperatura=new Temperatura();
       
    
    }
    
    public void notifyToAll(){
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    public String getUf() {
        return uf.getUf();
    }

    public void setUf(String uf) {
        
        this.uf.setUf(uf);
        
        this.notifyToAll();
    }

    public String getCidade() {
        return cidade.getNome();
    }

    public void setCidade(String cidade) {
        
        this.cidade.setNome(cidade);
        this.notifyToAll();
        
    }

    public String getTempo() {
        return tempo.getTempo();
    }

    public void setTempo(String tempo) {
        this.tempo.setTempo(tempo);
        this.notifyToAll();
    }

    public float getTemperatura() {
        return temperatura.getTemperatura();
    }

    public void setTemperatura(float temperatura) {
        this.temperatura.setTemperatura(temperatura);
        
        this.notifyToAll();
    }
    
    
    
    
}
