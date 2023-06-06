package br.kaspper.entidades;

public class ClienteNormal extends Cliente {

    // definindo um construtor para ClienteNormal
    public ClienteNormal(String nome) {
        super(nome);
    }

    @Override

    public void realizaCompra(double valor) {
        super.realizaCompra(valor);
        System.out.println("O cliente " + this.getNome()+ " acumulou " + (int) (valor * 0.05) + " pontos. ");
    }

}
