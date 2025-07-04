package org.aplicacao.lista5.sistemacontrolebancario;

public class ContaEspecial extends ContaBancaria{
    private final double limiteCredito = 250;


    @Override
    public double informarSaldoDisponivel() {
        return saldo + limiteCredito;
    }
}
