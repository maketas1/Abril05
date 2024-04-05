package com.softtek.modelo;

public class Figura {
    protected int x;
    protected int y;

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calcularArea(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public String mostrarPosiciones() {
        return  "x->" + x +
                " e y->" + y;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
