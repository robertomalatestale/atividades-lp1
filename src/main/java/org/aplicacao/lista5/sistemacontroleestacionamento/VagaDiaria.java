package org.aplicacao.lista5.sistemacontroleestacionamento;

public class VagaDiaria extends Vaga{
    private int dias;

    public VagaDiaria(int numero, String placaVeiculo, int dias) {
        super(numero, placaVeiculo);
        setDias(dias);
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias devem ser positivos.");
        }
        this.dias = dias;
    }

    @Override
    public double calcularValorAluguel() {
        return dias * 10.0;
    }
}
