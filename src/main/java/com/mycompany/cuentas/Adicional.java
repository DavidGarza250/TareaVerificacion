package com.mycompany.cuentas;

public class Adicional extends Cuentas {
    private String titularAdicional;

    public Adicional(String numCuenta, double saldo, double interes, String fecha, String titularAdicional) {
        super(numCuenta, saldo, interes, fecha);
        this.titularAdicional = titularAdicional;
    }

    public String agregarTitularAdicional(String nombre) {
        this.titularAdicional = nombre;
        return "Titular adicional " + nombre + " añadido a la cuenta.";
    }

    public String actualizarTitularAdicional(String nombre) {
        this.titularAdicional = nombre;
        return "Información del titular adicional actualizada a: " + nombre;
    }
}
