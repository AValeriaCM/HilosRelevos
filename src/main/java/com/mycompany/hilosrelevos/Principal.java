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
public class Principal {

    Equipo equipo1 = new Equipo("1", 0, 100);
    Equipo equipo2 = new Equipo("2", 0, 100);
    Equipo equipo3 = new Equipo("3", 0, 100);
    Corredor atleta1 = new Corredor(equipo1, 0, 33);
    Corredor atleta2 = new Corredor(equipo2, 0, 33);
    Corredor atleta3 = new Corredor(equipo3, 0, 33);
    Corredor atleta4 = new Corredor(equipo1, 33, 66);
    Corredor atleta5 = new Corredor(equipo2, 33, 66);
    Corredor atleta6 = new Corredor(equipo3, 33, 66);
    Corredor atleta7 = new Corredor(equipo1, 66, 100);
    Corredor atleta8 = new Corredor(equipo2, 66, 100);
    Corredor atleta9 = new Corredor(equipo3, 66, 100);
    
    public void iniciar(){
        atleta1.start ();

        atleta2.start ();

        atleta3.start ();

        atleta4.start ();

        atleta5.start ();

        atleta6.start ();

        atleta7.start ();

        atleta8.start ();

        atleta9.start ();
    }
}
