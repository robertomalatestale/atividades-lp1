package org.aplicacao.lista2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String categoria;

    public Produto(String nome, String categoria, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        setQuantidadeEstoque(quantidadeEstoque);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque<0){
            throw new QuantidadeInvalidaException();
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0){
            throw new QuantidadeInvalidaException();
        }
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade<=0){
            throw new QuantidadeInvalidaException("Quantidade adicionada tem que ser um número positivo");
        }
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade){
        if(quantidade>this.quantidadeEstoque){
            throw new IllegalArgumentException("Estoque não pode ficar negativo");
        }
        if(quantidade<=0){
            throw new QuantidadeInvalidaException("Quantidade removida tem que ser um número positivo");
        }
        this.quantidadeEstoque -= quantidade;
    }

    public void aplicarDesconto (double percentualDesconto){
        setPreco(this.preco - (this.preco * percentualDesconto));
    }
}
