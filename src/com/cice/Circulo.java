package com.cice;

import static java.lang.Math.*;

public class Circulo {


    private double area;
    private double perimetro;
    private double radio;




    public Circulo(double radio){

        this.radio=radio;
        this.area=Math.PI*radio*radio;
        this.perimetro=2*Math.PI*radio;
    }

    public double calculaArea(){

        area=0;
        area =radio*radio* PI;
        return area;
    }

    public double calcularPerimetro(){

        perimetro=2*radio* Math.PI;
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
