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
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player Juancito=new Player("Juancito", "Rojo");
        for (int i = 0; i < 10; i++) {
            Juancito.lanzarDado();
        
        }
    }
    
}
