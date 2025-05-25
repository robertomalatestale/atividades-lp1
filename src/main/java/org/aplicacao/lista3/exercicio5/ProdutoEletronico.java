package org.aplicacao.lista3.exercicio5;

public class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, double precoUnitario, int quantidadeEmEstoque) {
        super(nome, precoUnitario, quantidadeEmEstoque);
    }

    @Override
    public double calcularPreco(int quantidade) {
        lancaExcecaoSeQuantidadeMaiorQueEstoqueOuQuantidadeNegativaOuZero(quantidade);
        baixarEstoque(quantidade);
        return getPrecoUnitario() * quantidade;
    }
}
