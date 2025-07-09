package org.aplicacao.lista5.sistemavideolocadora;

import java.time.LocalDate;

public abstract class Emprestimo {
    protected String nomeFilme;
    protected LocalDate dataEmprestimo;
    protected int diasAlugados;

    public Emprestimo(String nomeFilme, int diasAlugados) {
        setNomeFilme(nomeFilme);
        this.dataEmprestimo = LocalDate.now();
        setDiasAlugados(diasAlugados);
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }

    public void setDiasAlugados(int diasAlugados) {
        if(diasAlugados<=0){
            throw new IllegalArgumentException("Dias de fita alugados deve ser positivo");
        }
        this.diasAlugados = diasAlugados;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public abstract double calculaValor();
}