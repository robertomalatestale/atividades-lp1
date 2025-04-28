package org.aplicacao.lista2;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        setSalario(salario);
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario<0){
            throw new QuantidadeInvalidaException();
        }
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void receberAumento(double percentual){
        setSalario(this.salario + (this.salario*percentual));
    }

    public void mudarDepartamento(String novoDepartamento){
        setDepartamento(novoDepartamento);
    }

    public String exibirDados(){
        return("Funcionario " + this.nome + " que trabalha no cargo de " + this.cargo + " recebendo o salário de " + this.salario + " reais no departamento de " + this.departamento);
    }
}
