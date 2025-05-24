package org.aplicacao.lista3.exercicio6;

public abstract class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, double saldo, String titular) {
        setNumeroConta(numeroConta);
        setSaldo(saldo);
        setTitular(titular);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.trim().isEmpty()){
            throw new IllegalArgumentException("Campo número da conta não deve estar vazio");
        }
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo<-250){
            throw new IllegalArgumentException("Cliente só pode dever até 250 reais");
        }
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular.trim().isEmpty()){
            throw new IllegalArgumentException("Campo titular da conta não deve estar vazio");
        }
        this.titular = titular;
    }

    public abstract void depositar(double valorDepositado);

    public void sacar(double valorSaque){
        if(valorSaque <=0){
            throw new IllegalArgumentException("Valor sacado deve ser positivo");
        }
        if (valorSaque-250>this.saldo){
            throw new IllegalArgumentException("Não é possível sacar esse valor");
        }
        setSaldo(this.saldo - valorSaque);
    }

}
