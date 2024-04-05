package com.softtek.presentacion.herencias;

import com.softtek.modelo.ejercicio2.Gerente;
import com.softtek.modelo.ejercicio2.Vendedor;
import com.softtek.modelo.ejercicio2.Operador;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre = "pepe";
        double sueldo = 5000;
        Gerente gerente = new Gerente(nombre, sueldo, 1000);
        System.out.println("El " + gerente.toString() + " con una nomina de " + gerente.calcularNomina() + "€");

        nombre = "juan";
        sueldo = 300;
        Vendedor vendedor = new Vendedor(nombre, sueldo, 5, 50);
        System.out.println("El " + vendedor.toString() + " con una nomina de " + vendedor.calcularNomina() + "€");

        nombre = "jose luis";
        sueldo = 10000;
        Operador operador = new Operador(nombre, sueldo, 100, 5);
        System.out.println("El " + operador.toString() + " con una nomina de " + operador.calcularNomina() + "€");
    }
}
