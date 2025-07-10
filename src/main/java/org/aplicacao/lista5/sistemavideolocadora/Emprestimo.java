package org.aplicacao.lista5.sistemavideolocadora;

import java.time.LocalDate;

public abstract class Emprestimo {
    protected String nomeFilme;
    protected LocalDate dataEmprestimo;
    protected int diasAlugados;
    protected Cliente cliente;

    public Emprestimo(String nomeFilme, int diasAlugados, Cliente cliente) {
        setNomeFilme(nomeFilme);
        this.dataEmprestimo = LocalDate.now();
        setDiasAlugados(diasAlugados);
        setCliente(cliente);
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("Empréstimo deve ter um cliente associado");
        }
        this.cliente = cliente;
    }

    public abstract double calculaValor();
}