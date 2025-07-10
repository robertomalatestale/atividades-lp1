package org.aplicacao.lista5.sistemacontrolebancario;

public class ContaEspecial extends ContaBancaria{


    public ContaEspecial(Cliente dono, String numeroConta) {
        super(dono, numeroConta);
    }

    @Override
    public double informarSaldoDisponivel() {
        double limiteCredito = 250;
        return saldo + limiteCredito;
    }
}
