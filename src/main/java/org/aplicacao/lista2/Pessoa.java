package org.aplicacao.lista2;

public class Pessoa {
    private String nome;
    private double idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, double idade, double peso, double altura) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome deve conter algo");
        }
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        if(idade>120 || idade<=0){
            throw new IllegalArgumentException("Idade inválida");
        }
        if(idade<1){
            this.idade = (double) Math.round(idade * 10)/10.0;
        } else {
            this.idade = (double) Math.round(idade);}
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso<=0){
            throw new IllegalArgumentException("Peso não pode ser igual a 0 ou negativo");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<=0){
            throw new IllegalArgumentException("Altura não pode ser igual a 0 ou negativa");
        }
        this.altura = altura;
    }

    public void envelhecer(){
        setIdade((this.idade+1));
    }

    public void crescer(double centimetros){
        if(this.idade>21){
            throw new IllegalStateException("Não pode crescer mais pois ja é maior de 21 anos");
        }
        setAltura((this.altura + centimetros/100));
    }

    public void ganharPeso(double quilos){
        if(quilos<=0){
            throw new QuantidadeInvalidaException("Quantidade peso não pode ser 0 ou negativo");
        }
        setPeso((this.peso+quilos));
    }

    public void perderPeso(double quilos){
        if(quilos<=0){
            throw new QuantidadeInvalidaException("Quantidade peso não pode ser 0 ou negativo");
        }
        setPeso((this.peso-quilos));
    }
}
