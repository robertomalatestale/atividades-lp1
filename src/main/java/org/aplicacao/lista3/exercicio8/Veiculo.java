package org.aplicacao.lista3.exercicio8;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double precoBase;

    public Veiculo(String marca, String modelo, double precoBase) {
        setMarca(marca);
        setModelo(modelo);
        setPrecoBase(precoBase);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.trim().isEmpty()){
            throw new IllegalArgumentException("Campo marca não deve estar vazio");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.trim().isEmpty()){
            throw new IllegalArgumentException("Campo modelo não deve estar vazio");
        }
        this.modelo = modelo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if(precoBase<=0){
            throw new IllegalArgumentException("Preço base deve ser positivo");
        }
        this.precoBase = precoBase;
    }

    public abstract double calcularCusto();
}
