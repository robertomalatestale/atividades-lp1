package org.aplicacao.lista5.sistemacontroletransportadora;

public class FreteUrgente extends Frete{
    private double taxaEntrega;
    private int numeroDeItens;

    public FreteUrgente(double valor, double taxaEntrega, int numeroDeItens) {
        super(valor);
        setTaxaEntrega(taxaEntrega);
        setNumeroDeItens(numeroDeItens);
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        if(taxaEntrega<0){
            throw new IllegalArgumentException("Taxa de entrega não pode ser negativa");
        }
        this.taxaEntrega = taxaEntrega;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        if(numeroDeItens<0){
            throw new IllegalArgumentException("Número de itens não pode ser negativo");
        }
        this.numeroDeItens = numeroDeItens;
    }

    @Override
    public double calcularValorTotalEntrega() {
        return valor + taxaEntrega + numeroDeItens * 10.0;
    }
}
