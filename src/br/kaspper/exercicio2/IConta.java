package br.kaspper.exercicio2;

public interface IConta {
    
    public void depositar(double valor);
    public double sacar(double valor);
    public double calcTarifa (double valor);
}
