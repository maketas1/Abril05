package com.softtek.presentacion.herencias;

import com.softtek.modelo.ejercicio3.Triangulo;
import com.softtek.modelo.ejercicio3.Cuadrado;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Apartado 1");
        Cuadrado cPequeño = new Cuadrado();
        cPequeño.setLado(10);
        cPequeño.setX(0);
        cPequeño.setY(0);
        System.out.println("El " + cPequeño.toString() + " a sido creado");
        System.out.println("El area de este cuadrado es: " + cPequeño.calcularArea() + " y sus posiciones son: " + cPequeño.mostrarPosiciones());
        System.out.println(" ");

        System.out.println("Apartado 2");
        Cuadrado cMediano = new Cuadrado(10, 10, 30);
        System.out.println("El " + cMediano.toString() + " a sido creado");
        System.out.println("El area de este cuadrado es: " + cMediano.calcularArea() + " y sus posiciones son: " + cMediano.mostrarPosiciones());
        System.out.println(" ");

        System.out.println("Apartado 3");
        Triangulo tPequeño = new Triangulo();
        tPequeño.setAltura(5);
        tPequeño.setBase(7);
        tPequeño.setX(20);
        tPequeño.setY(20);
        System.out.println("El " + tPequeño.toString() + " a sido creado");
        System.out.println("El area de este triangulo es: " + tPequeño.calcularArea() + " y sus posiciones son: " + tPequeño.mostrarPosiciones());
        System.out.println(" ");

        System.out.println("Apartado 4");
        Triangulo tMediano = new Triangulo(30, 30, 15, 10);
        System.out.println("El " + tMediano.toString() + " a sido creado");
        System.out.println("El area de este triangulo es: " + tMediano.calcularArea() + " y sus posiciones son: " + tMediano.mostrarPosiciones());
    }
}
