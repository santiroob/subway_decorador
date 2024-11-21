/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subway;

/**
 *
 * @author santi
 */
public class ExtraHongos extends SubwayDecorator {
    
    public ExtraHongos(ISubway subway){
        super(subway);
    }
    
    @Override
    public String getDescripcion(){
        switch (getSubway().getTamaño()) {
            case 15:
               return getSubway().getDescripcion().concat(" + EXTRA HONGOS ($0.85)");
            case 30:
                return getSubway().getDescripcion().concat(" + EXTRA HONGOS ($1.45)");
            default:
                return getSubway().getDescripcion();
        }
        
    }
    
    @Override
    public double getPrecio(){
        
        double precioOriginal = getSubway().getPrecio();
        switch (getSubway().getTamaño()) {
            case 15:
                return precioOriginal + 0.85;  
            case 30:
                return precioOriginal + 1.45;  
            default:
                return precioOriginal;  
        }
    }
    
}
