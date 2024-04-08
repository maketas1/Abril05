package com.softtek.presentacion.herencias;

import com.softtek.modelo.ejercicio4.InstrumentoMusical;
import com.softtek.modelo.ejercicio4.Guitarra;
import com.softtek.modelo.ejercicio4.Bateria;
import com.softtek.modelo.ejercicio4.Flauta;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Apartado 1");
        Guitarra guitarra = new Guitarra("Aria", "Delgadas");
        System.out.println(guitarra.toString());
        System.out.println(" ");

        System.out.println("Apartado 2");
        Bateria bateria = new Bateria("Yamaha", 2);
        System.out.println(bateria.toString());
        System.out.println(" ");

        System.out.println("Apartado 3");
        Flauta flauta = new Flauta("Fentar", "Madera");
        System.out.println(flauta.toString());
        System.out.println(" ");

        System.out.println("Ejercicio 4");
        InstrumentoMusical[] lista = new InstrumentoMusical[3];
        lista[0] = guitarra;
        lista[1] = bateria;
        lista[2] = flauta;
        System.out.println(" ");

        System.out.println("Ejercicio 5");
        for (InstrumentoMusical instrumentoMusical : lista) {
            System.out.println(instrumentoMusical.emitirSonido());
        }
    }
}
