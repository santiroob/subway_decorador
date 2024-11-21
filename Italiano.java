/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subway;

/**
 *
 * @author santi
 */
public class Italiano implements ISubway {

    private int tamaño;
    private double precio;
    private String descripcion = "SUB ITALIANO";
    

    public Italiano(int tamaño) {
        this.tamaño = tamaño;
        if (tamaño == 15) {
            precio = 9.0;
            descripcion = descripcion.concat((" 15CM ($9.0)"));
        } else if (tamaño == 30) {
            precio = 16.0;
            descripcion = descripcion.concat((" 30CM ($16.0)"));
        }
    }

    @Override
    public int getTamaño() {
        return this.tamaño;
    }
    
   
    @Override
    public double getPrecio() {
        return this.precio;     
    }
    
    @Override
    public String getDescripcion() {
        return this.descripcion;     
    }

    
    
}

