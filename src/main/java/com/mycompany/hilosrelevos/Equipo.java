/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilosrelevos;

/**
 *
 * @author Valeria Castañeda
 */
public class Equipo extends Thread {
    
   /**
    * Declaracion de variables
    */
    private String nombre;
  
    private int inicio;
   
    private int fin;
    
    private int posicionA;
   
    private int posicionB;
    
    private int posicionC;
   /**
    * Constructor de la clase
    * @param nombre
    * @param inicio
    * @param fin 
    */
    public Equipo(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.posicionA = 0;
        this.posicionB = 33;
        this.posicionC = 66;
    }
    /**
     * metodo sincronizado que imprime posiciones de los 
     * corredores
     * @return 
     */
    public synchronized String imprimir() {
        String trayecto = "Equipo: "+nombre+" ";
        for (int i = inicio; i <= fin; i++) {
            if (i == posicionA) {
                trayecto += "01";
            } else if (i == posicionB) {
                trayecto += "02";
            } else if (i == posicionC) {
                trayecto += "03";
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
