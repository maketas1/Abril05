package com.softtek.modelo.ejercicio4;

public class Bateria extends InstrumentoMusical{
    private int numPlatillos;

    public Bateria() {
    }

    @Override
    public String emitirSonido() {
        return "la caja ha sido golpeada";
    }

    public Bateria(String marca, int numPlatillos) {
        super(marca);
        this.numPlatillos = numPlatillos;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "numPlatillos=" + numPlatillos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public int getNumPlatillos() {
        return numPlatillos;
    }

    public void setNumPlatillos(int numPlatillos) {
        this.numPlatillos = numPlatillos;
    }
}
