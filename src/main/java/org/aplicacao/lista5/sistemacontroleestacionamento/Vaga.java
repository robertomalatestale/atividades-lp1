package org.aplicacao.lista5.sistemacontroleestacionamento;

public abstract class Vaga {
    protected int numero;
    protected String placaVeiculo;

    public Vaga(int numero, String placaVeiculo) {
        setNumero(numero);
        setPlacaVeiculo(placaVeiculo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número da vaga não pode ser negativo");
        }
        this.numero = numero;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        if (placaVeiculo.trim().isEmpty()) {
            throw new IllegalArgumentException("Placa do veículo inválida, não foi preenchida");
        }
        this.placaVeiculo = placaVeiculo.trim();
    }

    public abstract double calcularValorAluguel();
}
