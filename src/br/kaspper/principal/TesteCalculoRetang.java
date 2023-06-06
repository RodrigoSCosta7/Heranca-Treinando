package br.kaspper.principal;

import br.kaspper.exercicio1.CalculoRetangulo;

public class TesteCalculoRetang {
    
    public static void main(String[] args) {
        
        CalculoRetangulo calcArea = new CalculoRetangulo();

        int calculo = calcArea.AreaRet(10, 20);

        System.out.println("A Area do retangulo é " + calculo);
    }
}
