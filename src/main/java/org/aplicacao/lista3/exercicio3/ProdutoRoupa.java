package org.aplicacao.lista3.exercicio3;

public class ProdutoRoupa extends Produto{
    public ProdutoRoupa(String nome, float precoBase) {
        super(nome, precoBase);
    }


    public float getDesconto() {
        return 20;
    }
}
