package org.aplicacao.lista3.exercicio7;

import java.time.LocalDate;

public abstract class MaterialBiblioteca {

    private String titulo;
    private LocalDate dataPublicacao;
    private LocalDate dataEmprestimo;

    public MaterialBiblioteca(String titulo, LocalDate dataPublicacao, LocalDate dataEmprestimo) {
        setTitulo(titulo);
        setDataPublicacao(dataPublicacao);
        setDataEmprestimo(dataEmprestimo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.trim().isEmpty()){
            throw new IllegalArgumentException("Titulo deve ser preenchido");
        }
        this.titulo = titulo;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        if(dataPublicacao == null){
            throw new IllegalArgumentException("Data não pode ser nula");
        }
        this.dataPublicacao = dataPublicacao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        if(dataEmprestimo == null){
            throw new IllegalArgumentException("Data não pode ser nula");
        }
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate calcularDataDevolucao(){
        return this.dataEmprestimo.plusDays(quantidadeDiasQuePodeFicarEmprestado());
    }

    public abstract int quantidadeDiasQuePodeFicarEmprestado();
}
