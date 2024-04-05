package com.softtek.modelo;

public class Gerente extends Empleado{
    private double bono;

    public Gerente() {
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }

    public double calcularNomina() {
        return super.calcularNomina(bono);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre=" + nombre +
                ", sueldo=" + sueldo +
                "€, porcentaje=" + porcentaje +
                ", bono=" + bono +
                "€}";
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
