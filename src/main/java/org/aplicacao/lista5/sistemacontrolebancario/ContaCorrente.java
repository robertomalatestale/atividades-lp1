package org.aplicacao.lista5.sistemacontrolebancario;

public class ContaCorrente extends ContaBancaria{



    @Override
    public double informarSaldoDisponivel() {
        return saldo;
    }
}
