package org.aplicacao.lista5.sistemacontroletransportadora;

public abstract class Frete {
    protected double valor;

    public Frete(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor<=0){
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        this.valor = valor;
    }

    public abstract double calcularValorTotalEntrega();
}
