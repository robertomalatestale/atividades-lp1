package org.aplicacao.prova;

public class Transacao {
    private String dataTransacao;
    private int qtde;
    private Produto produto;

    public Transacao(String dataTransacao, int qtde, Produto produto) {
        this.dataTransacao = dataTransacao;
        this.qtde = qtde;
        setProduto(produto);
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if(produto == null){
            throw new IllegalArgumentException("Deve ter um produto associado");
        }
        this.produto = produto;
    }
}
