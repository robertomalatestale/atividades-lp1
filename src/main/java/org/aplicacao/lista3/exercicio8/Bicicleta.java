package org.aplicacao.lista3.exercicio8;

public class Bicicleta extends Veiculo{
    private static final double FATOR_CUSTO = 1.2;

    public Bicicleta(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return getPrecoBase() * FATOR_CUSTO;
    }

}
