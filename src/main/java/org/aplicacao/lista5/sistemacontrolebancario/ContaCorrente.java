package org.aplicacao.lista5.sistemacontrolebancario;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente(Cliente dono, String numeroConta) {
        super(dono, numeroConta);
    }

    @Override
    public double informarSaldoDisponivel() {
        return saldo;
    }
}
