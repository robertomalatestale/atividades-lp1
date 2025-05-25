package org.aplicacao.lista3.exercicio5;

public class ProdutoAlimento extends Produto{


    public ProdutoAlimento(String nome, double precoQuilo, int quantidadePacotesDeAlimento) {
        super(nome, precoQuilo, quantidadePacotesDeAlimento);
    }

    @Override
    public double calcularPreco(int quantidadePacotesDeAlimento) {
        lancaExcecaoSeQuantidadeMaiorQueEstoqueOuQuantidadeNegativaOuZero(quantidadePacotesDeAlimento);
        baixarEstoque(quantidadePacotesDeAlimento);
        return getPrecoUnitario() * quantidadePacotesDeAlimento;
    }
}
