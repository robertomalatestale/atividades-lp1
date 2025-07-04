package org.aplicacao.lista5.sistemacontroletransportadora;

public class FreteNormal extends Frete{
    public FreteNormal(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorTotalEntrega() {
        return valor;
    }
}
