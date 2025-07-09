package org.aplicacao.lista5.sistemacontroleacademico;

public abstract class Aluno {
    protected String nome;
    protected String matricula;
    protected String endereco;
    protected int numeroDeParcelas;

    public Aluno(String nome, String matricula, String endereco, int numeroDeParcelas) {
        setNome(nome);
        setMatricula(matricula);
        setEndereco(endereco);
        setNumeroDeParcelas(numeroDeParcelas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula.trim().isEmpty()){
            throw new IllegalArgumentException("Matrícula deve ser preenchida");
        }
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        if(numeroDeParcelas <= 0){
            throw new IllegalArgumentException("Número de parcelas deve ser positivo");
        }
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public abstract double getValorMensalidade();
}
