package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

public abstract class EquipamentoComPecasTrocadas extends Equipamento{
    protected double valorTotalPecasTrocadas;

    public EquipamentoComPecasTrocadas(double valorMaoDeObra, double valorTotalPecasTrocadas) {
        super(valorMaoDeObra);
        setValorTotalPecasTrocadas(valorTotalPecasTrocadas);
    }

    public double getValorTotalPecasTrocadas() {
        return valorTotalPecasTrocadas;
    }

    public void setValorTotalPecasTrocadas(double valorTotalPecasTrocadas) {
        if (valorTotalPecasTrocadas < 0) {
            throw new IllegalArgumentException("Valor das peças trocadas não pode ser negativo");
        }
        this.valorTotalPecasTrocadas = valorTotalPecasTrocadas;
    }

    @Override
    public double getValorManuntencao() {
        return valorMaoDeObra + valorTotalPecasTrocadas;
    }
}
