package org.aplicacao.lista3.exercicio5;

public abstract class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidadeEmEstoque;


    public Produto(String nome, double precoUnitario) {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
    }

    public Produto(String nome, double precoUnitario, int quantidadeEmEstoque) {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto deve ser preenchido");
        }
        this.nome = nome.trim();
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("Preço deve ser positivo");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void baixarEstoque(int quantidade) {
        lancaExcecaoSeQuantidadeMaiorQueEstoqueOuQuantidadeNegativaOuZero(quantidade);
        this.quantidadeEmEstoque -= quantidade;
    }

    protected void lancaExcecaoSeQuantidadeMaiorQueEstoqueOuQuantidadeNegativaOuZero(int quantidade){
        if (quantidade > quantidadeEmEstoque) {
            throw new IllegalArgumentException("Operação inválida pois não há itens suficientes em estoque");
        }
        if (quantidade<=0){
            throw new IllegalArgumentException("Quantidade deve ser positiva");
        }
    }

    public abstract double calcularPreco(int quantidade);
}
