package br.kaspper.exercicio2;

public class ContaPoupanca extends Conta {

   

    public ContaPoupanca (String titular){
    
        super(titular);

    }

    @Override
    public double calcTarifa(double valor) {
        return 0 ;
    }
}
