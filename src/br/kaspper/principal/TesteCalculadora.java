package br.kaspper.principal;

import br.kaspper.entidades.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        //UTILIZANDO SOBRECARGA
        int num1 = calculadora.somar(10, 5);
        double num2 = calculadora.somar(0.5, 0.77);
        int num3 = calculadora.somar(15, 10, 5);

        System.out.println("Num1 " + num1 + " Num2 " + num2 + " Num3 " + num3);
        

    }
}
