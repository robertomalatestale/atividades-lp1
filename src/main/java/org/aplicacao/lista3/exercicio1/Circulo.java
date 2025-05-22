package org.aplicacao.lista3.exercicio1;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        if(raio<=0){
            throw new IllegalArgumentException("Raio inválido, deve ser positivo");
        }
        this.raio = raio;
    }

    public double calcularArea(){
        return (this.raio * this.raio * Math.PI);
    }

    public double calcularPerimetro(){
        return (2 * Math.PI * this.raio);
    }
}
