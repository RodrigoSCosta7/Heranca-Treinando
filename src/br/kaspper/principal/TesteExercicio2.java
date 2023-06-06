package br.kaspper.principal;


import br.kaspper.exercicio2.ContaCorrente;
import br.kaspper.exercicio2.ContaPoupanca;

public class TesteExercicio2 {

    public static void main(String[] args) {

        ContaCorrente contacorrente = new ContaCorrente("Pedro Augusto");

        contacorrente.setNumeroConta("105 55685");
        contacorrente.depositar(250);        

        System.out.println(contacorrente.getTitular());
        System.out.println(contacorrente.getNumeroConta());
        System.out.println(contacorrente.getSaldo());
        System.out.println(contacorrente.getCalcTarifa());

        ContaPoupanca contaPopanca  = new ContaPoupanca("Regina Pereira ");
        contaPopanca.setNumeroConta("108 108566");
        contaPopanca.depositar(300);
        System.out.println(contaPopanca.getTitular());
        System.out.println(contaPopanca.getNumeroConta());
        System.out.println(contaPopanca.getSaldo());
        System.out.println(contaPopanca.getCalcTarifa());


    }

}
