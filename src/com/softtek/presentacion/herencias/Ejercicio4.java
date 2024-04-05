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

        System.out.println("Apartado 4");
        InstrumentoMusical [] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = new InstrumentoMusical("Aria");
        instrumentos[1] = new InstrumentoMusical("Yamaha");
        instrumentos[2] = new InstrumentoMusical("Fentar");
        for (int i = 0; i < instrumentos.length; i++) {
            System.out.println(instrumentos[i].toString());
        }
        System.out.println(" ");

        System.out.println("Apartado 5");
        int contador = 0;
        String [] sonidos = new String[3];
        sonidos[0] = guitarra.emitirSonido();
        sonidos[1] = bateria.emitirSonido();
        sonidos[2] = flauta.emitirSonido();
        do {
            for (int i = 0; i < instrumentos.length; i++) {
                System.out.println(instrumentos[i].emitirSonido(sonidos[i]));
            }
            System.out.println(" ");
            contador++;
        } while (contador < 4);
    }
}
