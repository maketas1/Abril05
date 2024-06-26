package com.softtek.modelo.ejercicio3;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado() {
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }


    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
