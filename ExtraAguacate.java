/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subway;


/**
 *
 * @author santi
 */
public class ExtraAguacate extends SubwayDecorator {
    
    public ExtraAguacate(ISubway subway){
        super(subway);
    }
    
    @Override
    public String getDescripcion(){
        switch (getSubway().getTamaño()) {
            case 15:
               return getSubway().getDescripcion().concat(" + EXTRA AGUACATE ($1.5)");
            case 30:
                return getSubway().getDescripcion().concat(" + EXTRA AGUACATE ($2.5)");
            default:
                return getSubway().getDescripcion();
        }
        
    }
    
    @Override
    public double getPrecio(){
        
        double precioOriginal = getSubway().getPrecio();
        switch (getSubway().getTamaño()) {
            case 15:
                return precioOriginal + 1.5;  // Para tamaño 15 cm
            case 30:
                return precioOriginal + 2.5;  // Para tamaño 30 cm
            default:
                return precioOriginal;  // Si el tamaño es diferente, no cambia el precio
        }
    }
    
}
