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
    /**
     * Metodo que retorna
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que recibe
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getInicio() {
        return inicio;
    }
    /**
     * Metodo que recibe
     * @param inicio 
     */
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getFin() {
        return fin;
    }
    /**
     * Metodo que recibe
     * @param fin 
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getPosicionA() {
        return posicionA;
    }
    /**
     * Metodo que recibe
     * @param posicionA 
     */
    public void setPosicionA(int posicionA) {
        this.posicionA = posicionA;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getPosicionB() {
        return posicionB;
    }
    /**
     * Metodo que recibe
     * @param posicionB 
     */
    public void setPosicionB(int posicionB) {
        this.posicionB = posicionB;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public int getPosicionC() {
        return posicionC;
    }
   /**
    * Metodo que recibe
    * @param posicionC 
    */
    public void setPosicionC(int posicionC) {
        this.posicionC = posicionC;
    }
    
    

}
