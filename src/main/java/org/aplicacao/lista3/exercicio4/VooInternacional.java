package org.aplicacao.lista3.exercicio4;

import java.time.LocalDate;

public class VooInternacional extends Voo{
    private static final double FATOR_PRECO_INTERNACIONAL = 0.5;
    private static final double TAXA_CAMBIO = 5.0;

    public VooInternacional(String origem, String destino, double distancia, LocalDate data) {
        super(origem, destino, distancia, data);
    }

    @Override
    public double calcularPreco() {
        return getDistancia() * FATOR_PRECO_INTERNACIONAL * TAXA_CAMBIO;
    }
}
