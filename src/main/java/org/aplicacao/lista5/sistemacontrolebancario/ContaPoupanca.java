package org.aplicacao.lista5.sistemacontrolebancario;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Cliente dono, String numeroConta) {
        super(dono, numeroConta);
    }

    @Override
    public double informarSaldoDisponivel() {
        return saldo;
    }
}
