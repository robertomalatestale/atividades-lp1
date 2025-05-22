package org.aplicacao.lista3.exercicio3;

public class ProdutoLivro extends Produto{
    public ProdutoLivro(String nome, float precoBase) {
        super(nome, precoBase);
    }

    public float getDesconto(){
        return 5;
    }
}
