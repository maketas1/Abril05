package com.softtek.modelo.ejercicio4;

public abstract class InstrumentoMusical {
    protected String marca;

    public InstrumentoMusical() {
    }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public abstract String emitirSonido();

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "marca='" + marca + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
