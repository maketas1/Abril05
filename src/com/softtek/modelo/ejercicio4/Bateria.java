package com.softtek.modelo.ejercicio4;

public class Bateria extends InstrumentoMusical{
    private int numPlatillos;

    public Bateria() {
    }

    public Bateria(String marca, int numPlatillos) {
        super(marca);
        this.numPlatillos = numPlatillos;
    }

    public String emitirSonido() {
        return super.emitirSonido("la caja ha sido golpeada");
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
