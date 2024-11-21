/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subway;

/**
 *
 * @author santi
 */
public class Refresco extends SubwayDecorator {
    
    public Refresco(ISubway subway){
        super(subway);
    }
    
    @Override
    public String getDescripcion(){
        return getSubway().getDescripcion().concat(" + REFRESCO($1.5)");    }
    
    @Override
    public double getPrecio(){
        
        return getSubway().getPrecio() + 1;
          
        
    }
    
}
