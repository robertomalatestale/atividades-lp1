package org.aplicacao.lista5.sistemacontroletransportadora;

public class FreteEspecial extends Frete{
    private double taxaEntrega;

    public FreteEspecial(double valor, double taxaEntrega) {
        super(valor);
        setTaxaEntrega(taxaEntrega);
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

    @Override
    public double calcularValorTotalEntrega() {
        return valor + taxaEntrega;
    }
}
