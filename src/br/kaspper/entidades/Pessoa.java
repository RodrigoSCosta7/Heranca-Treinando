package br.kaspper.entidades;

// Utilizando o abstract - ela n pode ser instanciada nessa caso ela fica somente como modelo para ser utilizado em outras classes

public abstract class Pessoa {
    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
