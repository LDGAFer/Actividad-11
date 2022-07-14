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
public class Circle implements Shape{

    public static final double PI = 3.141592;
    private double radio;

    public Circle(double radio){
        this.radio=radio;
    }

    public double getRadio(){
        return radio;
    }

    public double getArea() {
        return PI*pow(radio,2);
    }

    public double getPerimeter() {
        return PI*(radio*2);
    }
}