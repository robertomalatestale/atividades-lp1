package org.aplicacao.lista5.sistemacontrolebancario;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public double informarSaldoDisponivel() {
        return saldo;
    }
}
