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
public class Dado {
    public int getNumber(){
        int a= (int)(Math.random()*6+1);
        return a;
    }
    
}
