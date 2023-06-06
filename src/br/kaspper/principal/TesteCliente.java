package br.kaspper.principal;

import br.kaspper.entidades.Cliente;
import br.kaspper.entidades.ClienteNormal;
import br.kaspper.entidades.ClientePremium;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente joao = new ClienteNormal("João");
        Cliente maria = new ClientePremium("Maria");

        joao.realizaCompra(100.0);
        maria.realizaCompra(200.0);
    }
}
