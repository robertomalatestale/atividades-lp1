package org.aplicacao.lista5.sistemacontrolebancario;

public abstract class ContaBancaria {
    protected Cliente dono;
    protected String numeroConta;
    protected double saldo;

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        if(dono == null){
            throw new IllegalArgumentException("Dono não pode ser nulo");
        }
        this.dono = dono;
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
        this.saldo = saldo;
    }

    public abstract double informarSaldoDisponivel();
}
