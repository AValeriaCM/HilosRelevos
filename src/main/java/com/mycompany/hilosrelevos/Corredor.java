/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilosrelevos;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que maneja la informacion y el movimiento de los atletas especificos.
 * @author Valeria Castañeda
 */
public class Corredor extends Thread {

    Equipo equipo;
    private int posicion;
    private int fin;
    private String equipoUno;
    private String equipoDos;
    private String equipoTres;
    
    /**
     * Constuctor de la clase 
     * @param equipo
     * @param posicion
     * @param fin 
     */
    public Corredor(Equipo equipo, int posicion, int fin) {
        this.equipo = equipo;
        this.posicion = posicion;
        this.fin = fin;
    }

    @Override
    public void run() {
        if (posicion == 0) {
            while (true) {
                int pasoActual = avanzar(1);
                if (pasoActual >= 33) {
                    equipo.setPosicionA(33);
                    synchronized (equipo) {
                        equipo.notifyAll();
                        posicion = 33;
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 33) {
            while (true) {
                int pasoActual = avanzar(2);
                if (pasoActual >= 66) {
                    equipo.setPosicionB(66);
                    synchronized (equipo) {
                        equipo.notify();
                    }
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if (posicion == 66) {
            while (true) {
                int pasoActual = avanzar(3);
                if (pasoActual >= 100) {
                    equipo.setPosicionC(100);
                    System.out.println("Equipo ganador "+ equipo.getNombre());
                    System.out.println("  /|||||||\\ ");
                    System.out.println(" |          |");
                    System.out.println("  \\   #1  /");
                    System.out.println("   \\     /");
                    System.out.println("    \\   / ");
                    System.out.println("     \\ /");
                    System.out.println("     |||");
                    System.out.println("    |||||");
                    System.out.println("    |||||");
                    System.out.println("     ||| ");
                    System.exit(0);
                    break;
                }
            }
        } else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    public int avanzar(int numeroAtleta) {
        try {
            Thread.sleep(500);            
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        int valorAvance = Utilitaria.random();
        if (numeroAtleta == 1) {
            equipo.setPosicionA(equipo.getPosicionA() + valorAvance);
            if(equipo.imprimir().contains("1")){
                equipoUno=equipo.imprimir();
            }else if(equipo.imprimir().contains("2")){
                equipoTres=equipo.imprimir();
            }else if(equipo.imprimir().contains("3")){
                equipoDos=equipo.imprimir();
            }
            if(equipoUno!=null){
                System.out.println(equipoUno);
            }
            if(equipoDos!=null){
                System.out.println(equipoDos);
            }
            if(equipoTres!=null){
                System.out.println(equipoTres);
            }            
            return equipo.getPosicionA();
        }
        if (numeroAtleta == 2) {
            equipo.setPosicionB(equipo.getPosicionB() + valorAvance);
            if(equipo.imprimir().contains("1")){
                equipoUno=equipo.imprimir();
            }else if(equipo.imprimir().contains("2")){
                equipoTres=equipo.imprimir();
            }else if(equipo.imprimir().contains("3")){
                equipoDos=equipo.imprimir();
            }
            if(equipoUno!=null){
                System.out.println(equipoUno);
            }
            if(equipoDos!=null){
                System.out.println(equipoDos);
            }
            if(equipoTres!=null){
                System.out.println(equipoTres);
            }
            return equipo.getPosicionB();
        }
        if (numeroAtleta == 3) {
            equipo.setPosicionC(equipo.getPosicionC() + valorAvance);
            if(equipo.imprimir().contains("1")){
                equipoUno=equipo.imprimir();
            }else if(equipo.imprimir().contains("2")){
                equipoTres=equipo.imprimir();
            }else if(equipo.imprimir().contains("3")){
                equipoDos=equipo.imprimir();
            }
            if(equipoUno!=null){
                System.out.println(equipoUno);
            }
            if(equipoDos!=null){
                System.out.println(equipoDos);
            }
            if(equipoTres!=null){
                System.out.println(equipoTres);
            }
            
            return equipo.getPosicionC();
        }
        return 0;
    }
}
