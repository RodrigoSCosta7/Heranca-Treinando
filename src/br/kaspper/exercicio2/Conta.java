package br.kaspper.exercicio2;

public class Conta implements IConta {

    private String titular;
    private String numeroConta;
    private double saldo;
    private double calcTarifa;

    public double getCalcTarifa() {
        return calcTarifa;
    }

    public void setCalcTarifa(double calcTarifa) {
        this.calcTarifa = calcTarifa;
    }

    public Conta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        return this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        this.calcTarifa = valor * 0.02;

    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return saldo;
    }

    @Override
    public double calcTarifa(double valor) {

        return calcTarifa;
    }

    public void ExibirSaldo(double valor) {

        System.out
                .println("O saldo atual para essa movimentação é" + getSaldo() + "e foi cobrado " + calcTarifa(valor));

    }

}
