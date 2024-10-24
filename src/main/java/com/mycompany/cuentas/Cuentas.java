package com.mycompany.cuentas;

public class Cuentas {
    protected String numCuenta;
    protected double saldo;
    protected double interes;
    protected String fecha;

    public Cuentas(String numCuenta, double saldo, double interes, String fecha) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.interes = interes;
        this.fecha = fecha;
    }
}