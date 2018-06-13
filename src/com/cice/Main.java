package com.cice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);
        double radio;
        double perimetro;
        double area;


        System.out.println("CALCULAR AREA Y PERIMETRO DE UN CIRCULO");
        System.out.println("***************************************");
        System.out.println("Introduzca el radio del círulo: ");
        radio=sc.nextDouble();

        Circulo circulo=new Circulo(radio);
        System.out.println("El radio es " + circulo.getRadio());
        System.out.println("El área es: " + circulo.getArea());
        System.out.println("El perímetro es: "+ circulo.getPerimetro());
        

        // si no declaro en el constructor todos los atributos tendria que hacer
        area=circulo.calculaArea();
        System.out.println("El área del círculo es: "+ area);
        perimetro=circulo.calcularPerimetro();
        System.out.println("El perímetro del círculo es: " +perimetro);


    }
}
