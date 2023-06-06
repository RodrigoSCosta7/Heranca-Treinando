package br.kaspper.entidades;

public class ClientePremium extends Cliente {

    public ClientePremium(String nome) {
        super(nome);
        
    }

    @Override
    public void realizaCompra(double valor) {
        super.realizaCompra(valor);
        System.out.println("O cliente " + this.getNome()+ "  acumulou " + (int) (valor * 0.1) + " pontos.");
        
    }
    
}
