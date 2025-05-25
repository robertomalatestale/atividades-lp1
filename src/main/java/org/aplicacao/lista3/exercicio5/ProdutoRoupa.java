package org.aplicacao.lista3.exercicio5;

public class ProdutoRoupa extends Produto{
    private double desconto;

    public ProdutoRoupa(String nome, double precoUnitario, int quantidadeEmEstoque, double desconto) {
        super(nome, precoUnitario, quantidadeEmEstoque);
        setDesconto(desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto<0 || desconto > 100){
        throw new IllegalArgumentException("Desconto deve ser dado entre 0 e 100");
        }
        this.desconto = desconto;
    }


    @Override
    public double calcularPreco(int quantidade) {
        lancaExcecaoSeQuantidadeMaiorQueEstoqueOuQuantidadeNegativaOuZero(quantidade);
        baixarEstoque(quantidade);
        return (getPrecoUnitario() - getPrecoUnitario() * desconto/100) * quantidade;
    }
}
