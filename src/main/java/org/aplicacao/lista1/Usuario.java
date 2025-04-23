package org.aplicacao.lista1;

public class Usuario {
    public String nome;
    public char genero;

    public Usuario(String nome, char genero) {
        this.nome = nome;
        char g = Character.toUpperCase(genero); //Transforma em maiúsculo
        if (g != 'M' && g!='F'){
            throw new IllegalArgumentException("Gênero inválido: use 'M' ou 'F'");
        }
        this.genero = g;
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

    public double calculaContaEnergiaEletrica (double kilowattsConsumidos) {
        return (kilowattsConsumidos * 0.12) + (kilowattsConsumidos * 0.12)*0.18;
    }

    public double calculaMediaCombustivel (double quilometrosRodados, double litrosDeCombustivelConsumido) {
        return quilometrosRodados/ litrosDeCombustivelConsumido;
    }

    public String calculaIMC(char genero, double peso, double altura){
        System.out.println("Peso em kg e altura em metros");
        if (genero == 'M'){
            return calculaIMCHomem(peso,altura);
        } else if (genero == 'F'){
            return calculaIMCMulher(peso,altura);
        } else {
            return "Não é possível fazer essa operação, gênero não especificado corretamente.";
        }
    }

    public String calculaIMCHomem(double peso, double altura){
        double imc = peso/Math.pow(altura,2);
        if (imc < 20.7){
            return "Abaixo do peso";
        } else if (imc >=20.7 && imc<26.4) {
            return "No peso normal";
        } else if (imc >=26.4 && imc<27.8) {
            return "Marginalmente acima do peso";
        } else if (imc >=27.8 && imc<31.1) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }

    public String calculaIMCMulher(double peso, double altura){
        double imc = peso/Math.pow(altura,2);
        if (imc < 19.1){
            return "Abaixo do peso";
        } else if (imc >=19.1 && imc<25.8) {
            return "No peso normal";
        } else if (imc >=25.8 && imc<27.3) {
            return "Marginalmente acima do peso";
        } else if (imc >=27.3 && imc<32.3) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }
}


