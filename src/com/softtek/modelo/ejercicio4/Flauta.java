package com.softtek.modelo.ejercicio4;

public class Flauta extends InstrumentoMusical{
    private String material;

    public Flauta() {
    }

    @Override
    public String emitirSonido() {
        return "silvido en DO bemol";
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Flauta{" +
                "material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
