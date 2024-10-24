package com.mycompany.cuentas;

public class Nomina extends Cuentas {
    private String empleado;

    public Nomina(String numCuenta, double saldo, double interes, String fecha, String empleado) {
        super(numCuenta, saldo, interes, fecha);
        this.empleado = empleado;
    }

    public String pagoNomina(double monto) {
        this.saldo += monto;
        return "Pago de nómina de $" + monto + " recibido de " + this.empleado + " Saldo actual: $" + this.saldo;
    }

    public String adelantoNomina(double monto) {
        this.saldo -= monto;
        return "Adelanto de nómina de $" + monto + " realizado Saldo actual: $" + this.saldo;
    }
}
