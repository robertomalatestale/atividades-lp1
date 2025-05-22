package org.aplicacao.lista3.exercicio3;

public abstract class Produto {
    private String nome;
    private float precoBase;

    public Produto(String nome, float precoBase) {
        setNome(nome);
        setPrecoBase(precoBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome não deve ser vazio");
        }
        this.nome = nome.trim();
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if(precoBase<=0){
            throw new IllegalArgumentException("Preço deve ser positivo");
        }
        this.precoBase = precoBase;
    }

    public float calcularPreco(){
        return this.precoBase - (this.precoBase * getDesconto() / 100);
    }

    public abstract float getDesconto();
}
