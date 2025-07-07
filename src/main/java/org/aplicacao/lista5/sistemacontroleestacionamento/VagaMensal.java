package org.aplicacao.lista5.sistemacontroleestacionamento;

public class VagaMensal extends Vaga{
    private int meses;

    public VagaMensal(int numero, String placaVeiculo, int meses) {
        super(numero, placaVeiculo);
        setMeses(meses);
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        if (meses <= 0) {
            throw new IllegalArgumentException("Quantidade de meses não pode ser negativo");
        }
        this.meses = meses;
    }

    @Override
    public double calcularValorAluguel() {
        return meses * 150.0;
    }
}
