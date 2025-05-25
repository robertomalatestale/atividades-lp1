package org.aplicacao.lista3.exercicio4;

import java.time.LocalDate;

public abstract class Voo {
    private String origem;
    private String destino;
    private double distancia;
    private LocalDate data;

    public Voo(String origem, String destino, double distancia, LocalDate data) {
        setOrigem(origem);
        setDestino(destino);
        setDistancia(distancia);
        setData(data);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        if (origem.trim().isEmpty()) {
            throw new IllegalArgumentException("Deve preencher origem");
        }
        this.origem = origem.trim();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino.trim().isEmpty()) {
            throw new IllegalArgumentException("Dve preencher o destino");
        }
        this.destino = destino.trim();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("Distância deve ser positiva");
        }
        this.distancia = distancia;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data == null) {
            throw new IllegalArgumentException("Data não pode ser nula");
        }
        this.data = data;
    }

    public abstract double calcularPreco();
}