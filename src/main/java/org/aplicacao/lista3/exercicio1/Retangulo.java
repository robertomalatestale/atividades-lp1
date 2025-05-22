package org.aplicacao.lista3.exercicio1;

public class Retangulo extends FormaGeometrica{

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
       setLargura(largura);
       setAltura(altura);
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if(largura<=0){
            throw new IllegalArgumentException("Largura tem que ser positiva");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if(altura<=0){
            throw new IllegalArgumentException("Altura tem que ser positiva");
        }
        this.altura = altura;
    }

    public double calcularArea(){
        return (this.altura * this.largura);
    }

    public double calcularPerimetro(){
        return (this.altura*2 + this.largura * 2);
    }
}
