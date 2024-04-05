package com.softtek.modelo;

public class Operador extends Empleado {
    private int piezas;
    private double incentivo;

    public Operador() {
    }

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public double calcularNomina() {
        double aSumar = piezas * incentivo;
        return super.calcularNomina(aSumar);
    }

    @Override
    public String toString() {
        return "Operador{" +
                "nombre=" + nombre +
                ", sueldo=" + sueldo +
                "€, porcentaje=" + porcentaje +
                ", piezas=" + piezas +
                ", incentivo=" + incentivo +
                '}';
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}
