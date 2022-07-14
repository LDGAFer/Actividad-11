/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad11;

import static java.lang.Math.pow;

/**
 *
 * @author USER
 */
public class Square implements Shape{
    private double lado;

    public Square(double lado){
        this.lado=lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea() {
        return pow(lado,2);
    }

    @Override
    public double getPerimeter() {
        return lado*4;
    }
}