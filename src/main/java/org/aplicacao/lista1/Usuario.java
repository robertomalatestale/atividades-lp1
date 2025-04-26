package org.aplicacao.lista1;

public class Usuario {
    private String nome;
    private char genero;
    private double altura;
    private double peso;

    public Usuario(String nome, char genero) {
        this.nome = nome;
        setGenero(genero);
    }

    public Usuario(String nome, char genero, double altura) {
        this.nome = nome;
        setGenero(genero);
        setAltura(altura);
    }

    public Usuario(String nome, char genero, double altura, double peso) {
        this.nome = nome;
        setGenero(genero);
        setAltura(altura);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero){
        char g = Character.toUpperCase(genero);
        if (g != 'M' && g!='F'){
            throw new IllegalArgumentException("Gênero inválido: use 'M' ou 'F'");
        }
        this.genero = g;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Altura inválida, valor menor ou igual a 0");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("Peso inválido, valor menor ou igual a 0");
        }
        this.peso = peso;
    }

    public double calculaContaEnergiaEletrica (double kilowattsConsumidos) {
        return (kilowattsConsumidos * 0.12) + (kilowattsConsumidos * 0.12)*0.18;
    }

    public double calculaMediaCombustivel (double quilometrosRodados, double litrosDeCombustivelConsumido) {
        return quilometrosRodados/ litrosDeCombustivelConsumido;
    }

    public String calculaIMC(){
        if (this.genero == 'M'){
            return calculaIMCHomem();
        } else if (this.genero == 'F'){
            return calculaIMCMulher();
        } else {
            throw new IllegalArgumentException("Sexo inválido");
        }
    }

    public String calculaIMCHomem(){
        double imc = this.peso/Math.pow(this.altura,2);
        if (imc < 20.7){
            return "Abaixo do peso";
        } else if (imc<26.4) {
            return "No peso normal";
        } else if (imc<27.8) {
            return "Marginalmente acima do peso";
        } else if (imc<31.1) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }

    public String calculaIMCMulher(){
        double imc = this.peso/Math.pow(this.altura,2);
        if (imc < 19.1){
            return "Abaixo do peso";
        } else if (imc<25.8) {
            return "No peso normal";
        } else if (imc<27.3) {
            return "Marginalmente acima do peso";
        } else if (imc<32.3) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }
}


