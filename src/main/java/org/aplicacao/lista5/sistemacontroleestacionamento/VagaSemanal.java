package org.aplicacao.lista5.sistemacontroleestacionamento;

public class VagaSemanal extends Vaga{
    private int semanas;

    public VagaSemanal(int numero, String placaVeiculo, int semanas) {
        super(numero, placaVeiculo);
        setSemanas(semanas);
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        if (semanas <= 0) {
            throw new IllegalArgumentException("Número de semanas deve ser positivo");
        }
        this.semanas = semanas;
    }

    @Override
    public double calcularValorAluguel() {
        return semanas * 40.0;
    }
}
