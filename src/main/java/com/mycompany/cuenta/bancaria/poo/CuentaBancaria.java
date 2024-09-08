package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres;
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = 1.5;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }
    public double calcularInteres() {
        return saldo * (1 + tipoInteres / 100);
    }
    public void setTipoInteres(double tipoInteres) {
        if (tipoInteres >= 0 && tipoInteres <= 10) {
            this.tipoInteres = tipoInteres;
        }
    }
}