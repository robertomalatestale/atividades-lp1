package org.aplicacao.lista5.sistemacontroletransportadora;

public class FreteNormal extends Frete{
    public FreteNormal(double valor, Cliente cliente) {
        super(valor, cliente);
    }

    @Override
    public double calcularValorTotalEntrega() {
        return valor;
    }
}
