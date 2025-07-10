package org.aplicacao.lista5.sistemacontroletransportadora;

public abstract class Frete {
    protected double valor;
    protected Cliente cliente;

    public Frete(double valor, Cliente cliente) {
        setValor(valor);
        setCliente(cliente);
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("Cliente deve ser preenchido");
        }
        this.cliente = cliente;
    }

    public abstract double calcularValorTotalEntrega();
}
