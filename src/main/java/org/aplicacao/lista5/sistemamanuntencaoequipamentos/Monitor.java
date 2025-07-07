package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

public class Monitor extends Equipamento{
    public Monitor(double valorMaoDeObra) {
        super(valorMaoDeObra);
    }

    @Override
    public double getValorManuntencao() {
        return valorMaoDeObra;
    }
}
