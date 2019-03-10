/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nirodha
 */

import java.lang.Math.*;

public class Calculate {
    private double radius;
    public Calculate(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double perimetre(){
        double peri = 2*Math.PI*radius;
        return peri;
    }
    
    public double area(){
        double area_value = Math.PI*radius*radius;
        return area_value;
    }
    
    public double volume(){
        double vol = Math.PI*radius*radius*radius*4/3;
        
        return vol;
    }
}
