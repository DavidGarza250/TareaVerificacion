package com.mycompany.cuentas;

public class Ahorro extends Cuentas {
    private double cuotaManejo;

    public Ahorro(String numCuenta, double saldo, double interes, String fecha, double cuotaManejo) {
        super(numCuenta, saldo, interes, fecha);
        this.cuotaManejo = cuotaManejo;
    }

    public String aplicarInteres() {
        this.saldo += this.saldo * (this.interes / 100);
        return "Interés aplicado Saldo actual: " + this.saldo;
    }

    public String verificarSaldoMinimo(double saldoMinimo) {
        if (this.saldo < saldoMinimo) {
            return "El saldo de la cuenta es menor que el saldo mínimo requerido de: $" + saldoMinimo;
        } else {
            return "El saldo de la cuenta es suficiente. Saldo actual: " + this.saldo;
        }
    }
}