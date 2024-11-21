/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subway;

/**
 *
 * @author santi
 */
public class Sopa extends SubwayDecorator {
    
    public Sopa(ISubway subway){
        super(subway);
    }
    
    @Override
    public String getDescripcion(){
        return getSubway().getDescripcion().concat(" + SOPA($4.2)");
    }
    
    @Override
    public double getPrecio(){
        
        return getSubway().getPrecio() + 4.2;
          
        
    }
    
}
