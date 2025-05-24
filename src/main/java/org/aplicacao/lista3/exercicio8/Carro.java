package org.aplicacao.lista3.exercicio8;

public class Carro extends Veiculo {
    private static final double FATOR_CUSTO = 2;

    public Carro(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * FATOR_CUSTO;
    }
}
