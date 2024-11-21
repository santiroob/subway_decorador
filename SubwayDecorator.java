/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subway;

import com.mycompany.subway.ISubway;

/**
 *
 * @author santi
 */
public abstract class SubwayDecorator implements ISubway{
    
    private ISubway subway;
    
    public SubwayDecorator(ISubway subway){
        this.subway = subway;
    }
    
    public ISubway getSubway(){
        return this.subway;
    }
    
    @Override
    public int getTamaño(){
        return getSubway().getTamaño();
    }
    
    @Override
    public double getPrecio(){
        return getSubway().getPrecio();
    }
    
    @Override
    public String getDescripcion(){
        return getSubway().getDescripcion();
    }
}
