package com.softtek.modelo.ejercicio4;

public class Guitarra extends InstrumentoMusical{
    private String tipoCuerdas;

    public Guitarra() {
    }

    @Override
    public String emitirSonido() {
        return "acorde DO menor";
    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "tipoCuerdas='" + tipoCuerdas + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
