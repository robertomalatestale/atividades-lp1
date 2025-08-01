package org.aplicacao.prova;

public class Cliente extends Pessoa{
    private String cpf;

    public Cliente(String nome, String cpf) {
        super(nome);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
