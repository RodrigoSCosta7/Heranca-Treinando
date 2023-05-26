package br.kaspper.principal;

import br.kaspper.entidades.Mei;
import br.kaspper.entidades.PessoaFisica;
import br.kaspper.entidades.PessoaJuridica;

public class TestePessoa {
    public static void main(String[] args) {
        // Instanciando objetos Classe pessoa não pode ser instanciada
        // Pessoa pessoa = new Pessoa();
        // pessoa.setNome("Rodrigo");
        // pessoa.setEndereco("Edmundo Scanapieco");
        // System.out.println("Pessoa " + pessoa.getNome() + " Endereço " +
        // pessoa.getEndereco());

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Willian Rodrigues");
        pessoaFisica.setEndereco("Marechal Ricardo Gualda");
        pessoaFisica.setCpf("558.554.698-65");

        System.out.println("Pessoa Fisica " + pessoaFisica.getNome() + " Endereço " + pessoaFisica.getEndereco()
                + " CFP " + pessoaFisica.getCpf());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Otavio Augusto");
        pessoaJuridica.setEndereco("Gualda gusta mia");
        pessoaJuridica.setCnpj("49.393.549/0001-82");

        System.out.println("Pessoa Juridica " + pessoaJuridica.getNome() + " Endereco " + pessoaJuridica.getEndereco()
                + " CNPJ " + pessoaJuridica.getCnpj());

        Mei mei = new Mei();
        mei.setNome("GlossRads");
        mei.setEndereco("Distrito Industrial ");
        mei.setLimiteRenda(100000.00);
        mei.setCnpj("50.335.489/0001-88");
    }
}
