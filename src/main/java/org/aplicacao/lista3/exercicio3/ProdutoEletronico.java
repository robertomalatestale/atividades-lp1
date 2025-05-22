package org.aplicacao.lista3.exercicio3;

public class ProdutoEletronico extends Produto{
    public ProdutoEletronico(String nome, float precoBase) {
        super(nome, precoBase);
    }


    public float getDesconto() {
        return 10;
    }
}
