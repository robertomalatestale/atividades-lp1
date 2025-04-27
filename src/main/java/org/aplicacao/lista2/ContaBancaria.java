package org.aplicacao.lista2;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo<0){
            throw new QuantidadeInvalidaException("Quantidade inválida: saldo não pode ficar negativo");
        }
        this.saldo = saldo;
    }

    public void depositar(double quantidadeDepositada){
        if (quantidadeDepositada<=0){
            throw new QuantidadeInvalidaException("Quantidade inválida: deposito não pode ser negativo nem zero");
        }
        this.saldo += quantidadeDepositada;
    }

    public void sacar(double quantidadeSacada){
        if((this.saldo - quantidadeSacada) < 0){
            throw new QuantidadeInvalidaException("Quantidade inválida: saldo não pode ficar negativo");
        }
        if(quantidadeSacada<=0){
            throw new QuantidadeInvalidaException("Quantidade inválida: saque não pode ser negativo nem zero");
        }
        this.saldo -= quantidadeSacada;
    }
}
