package org.aplicacao.lista1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaAumento (double porcentagemAumento){
        return this.salario*porcentagemAumento;
    }

    public double aumentaSalario (double porcentagemAumento){
        return this.salario + calculaAumento(porcentagemAumento);
    }
}
