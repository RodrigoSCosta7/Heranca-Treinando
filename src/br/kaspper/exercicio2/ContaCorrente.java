package br.kaspper.exercicio2;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public double setSaldo(double saldo) {

        return this.setSaldo(saldo);

    }

    @Override
    public void depositar(double valor) {

        super.depositar(valor);
    }

    @Override
    public double calcTarifa(double valor) {
        
        return super.calcTarifa(valor);
    }

    @Override
    public void ExibirSaldo(double valor) {
        System.out.println("O seu saldo é de " + this.getSaldo());
    }

}
