package org.aplicacao.lista2;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade_atual;
    private boolean estado;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, double velocidade_atual, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade_atual = velocidade_atual;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(double velocidade_atual) {
        if(velocidade_atual<0){
            throw new IllegalArgumentException("Velocidade não pode ser negativa");
        }
        this.velocidade_atual = velocidade_atual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void acelerar(double quantidade){
        if(!isEstado()){
            throw new IllegalStateException("Carro não pode acelerar desligado");
        }
        if (quantidade<0){
            throw new QuantidadeInvalidaException();
        }
        setVelocidade_atual((getVelocidade_atual()+quantidade));
    }

    public void frear(double quantidade){
        if(!isEstado()){
            throw new IllegalStateException("Carro não pode frear desligado");
        }
        if (quantidade<0){
            throw new QuantidadeInvalidaException();
        }
        setVelocidade_atual((getVelocidade_atual()-quantidade));
    }

    public void ligar(){
        setEstado(true);
    }

    public void desligar(){
        setEstado(false);
        setVelocidade_atual(0);
    }

}
