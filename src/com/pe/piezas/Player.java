/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.piezas;

/**
 *
 * @author User
 */
public class Player {
    private String nombre;
    private String color;
    private int casilla=0;

    public Player(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public int lanzarDado(){
        
        
        casilla=casilla+new Dado().getNumber();
        if (casilla>25){
            casilla=50-casilla;
        }
        System.out.println(nombre+" esta en "+casilla);
        return casilla;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }
    
    
    
   
    
}
