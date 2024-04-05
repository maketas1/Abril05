package com.softtek.presentacion.herencias;

import com.softtek.modelo.ejercicio1.ProductoPerecedero;

import java.time.LocalDate;

public class Ejercicio1 {

    public static void main(String[] args) {

        String nombre = "yogur";
        int cantidad = 4;
        double pvp = 1.5;
        LocalDate fCaducidad = LocalDate.of(2024, 3, 15);
        LocalDate fFabricacion = LocalDate.of(2024, 4, 5);
        ProductoPerecedero productoPerecedero = new ProductoPerecedero(nombre, cantidad, pvp, fCaducidad, fFabricacion);
        System.out.println("Has creado el siguiente producto: " + productoPerecedero.toString());

        System.out.println("Entre la fecha de fabricacion y la fecha de caducidad te dan un margen de " + productoPerecedero.tiempoConsumicion() + " dias para consumir el producto");

        System.out.println("El precio final del producto es: " + productoPerecedero.cantidadAPagar());


    }
}
