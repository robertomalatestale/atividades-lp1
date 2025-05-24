package org.aplicacao.lista3.exercicio6;

public class ContaPoupanca extends ContaBancaria{
    private static final double JUROS_MENSAIS = 0.1;

    public ContaPoupanca(String numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(double valorDepositado) {
        if (valorDepositado <=0){
            throw new IllegalArgumentException("Valor depositado deve ser positivo");
        }
        setSaldo(getSaldo() + valorDepositado);
    }

    public void recebeJurosMensaisNaConta(){
        setSaldo(this.getSaldo() + (this.getSaldo() * JUROS_MENSAIS));
    }
}
