package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

public abstract class Equipamento {
    protected double valorMaoDeObra;

    public Equipamento(double valorMaoDeObra) {
        setValorMaoDeObra(valorMaoDeObra);
    }

    public double getValorMaoDeObra() {
        return valorMaoDeObra;
    }

    public void setValorMaoDeObra(double valorMaoDeObra) {
        if(valorMaoDeObra<=0){
            throw new IllegalArgumentException("Valor de mão de obra deve ser positivo");
        }
        this.valorMaoDeObra = valorMaoDeObra;
    }

    public abstract double getValorManuntencao();
}
