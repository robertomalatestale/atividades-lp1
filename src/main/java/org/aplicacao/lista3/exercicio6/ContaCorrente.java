package org.aplicacao.lista3.exercicio6;

public class ContaCorrente extends ContaBancaria{
    private static final double TAXA_MANUNTENCAO = 6;

    public ContaCorrente(String numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(double valorDepositado) {
        if (valorDepositado <=0){
            throw new IllegalArgumentException("Valor depositado deve ser positivo");
        }
        setSaldo(getSaldo() + valorDepositado - TAXA_MANUNTENCAO);
    }
}
