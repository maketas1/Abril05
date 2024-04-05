package com.softtek.modelo;

public class Vendedor extends Empleado{
    private double ventas;
    private double comision;

    public Vendedor() {
    }

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }

    public double calcularNomina() {
        double aSumar = ventas * comision;
        return super.calcularNomina(aSumar);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre=" + nombre +
                ", sueldo=" + sueldo +
                "€, porcentaje=" + porcentaje +
                ", ventas=" + ventas +
                ", comision=" + comision +
                '}';
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
