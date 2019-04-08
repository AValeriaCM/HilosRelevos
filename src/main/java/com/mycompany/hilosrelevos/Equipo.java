/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilosrelevos;

/**
 *
 * @author THATA
 */
public class Equipo extends Thread {
    
   
    private String nombre;
  
    private int inicio;
   
    private int fin;
    
    private int posicionA;
   
    private int posicionB;
    
    private int posicionC;
   
    public Equipo(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.posicionA = 0;
        this.posicionB = 33;
        this.posicionC = 66;
    }
    
    public synchronized String imprimir() {
        String trayecto = "Equipo: "+nombre+" ";
        for (int i = inicio; i <= fin; i++) {
            if (i == posicionA) {
                trayecto += "P1";
            } else if (i == posicionB) {
                trayecto += "P2";
            } else if (i == posicionC) {
                trayecto += "P3";
            } else {
                trayecto += "_";
            }
        }
        
        return trayecto;
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getInicio() {
        return inicio;
    }
    
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    
    public int getFin() {
        return fin;
    }
    
    public void setFin(int fin) {
        this.fin = fin;
    }
    
    public int getPosicionA() {
        return posicionA;
    }
    
    public void setPosicionA(int posicionA) {
        this.posicionA = posicionA;
    }
    
    public int getPosicionB() {
        return posicionB;
    }
    
    public void setPosicionB(int posicionB) {
        this.posicionB = posicionB;
    }
    
    public int getPosicionC() {
        return posicionC;
    }
   
    public void setPosicionC(int posicionC) {
        this.posicionC = posicionC;
    }
    
    

}
